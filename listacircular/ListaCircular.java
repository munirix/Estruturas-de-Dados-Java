package listacircular;

public class ListaCircular<T> {

    private NoCircular<T> cabeca;
    private NoCircular<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }
/**adiciona nó pela cauda */
    public void add(T conteudo){
        NoCircular<T> novoNo = new NoCircular<>(conteudo);
        if(tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;//faz essa igualdade pq a lista esta vazia
            this.cabeca.setNoProximo(this.cauda);
        }else{
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;//novoNo é a nova cauda
        }
        this.tamanhoLista++;
    }
/**remove nó do index no parametro */
    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        NoCircular<T> noAuxiliar = cauda;
        if(index == 0){ //estou na cauda
            this.cauda = this.cauda.getNoProximo();//cauda deixa de ser ela e se torna o proximo item depois dela
            this.cabeca.setNoProximo(cauda);//conecta a cabeça
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
            //a cauda aponta para a proxima(1) da proxima(2) referencia
        }else{
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }
/**retorna conteurdo presente no nó do index do parametro */
    public T get(int index){
        return getNo(index).getConteudo();
    }
/**metodo de uso interno. Retorna nó do index definido no parametro */
    private NoCircular<T> getNo(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");//solta um excessão

        if(index == 0){
            return this.cauda;
        }

        NoCircular<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index); i++){//&& (noAuxiliar != null) não precisa
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }
/**retorna se a lista esta vazia ou não */
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }
/**retorna tamanho da lista */
    public int size(){
        return this.tamanhoLista;
    }

    @Override
/*começa imprimindo pela cauda */
    public String toString() {
        String strRetorno = "";
        NoCircular<T> noAuxiliar = this.cauda;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No { conteudo = " + noAuxiliar.getConteudo() +" } ]--->\n";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += size() != 0 ? "(Retorna ao início)" : "[]";
        return strRetorno;
    }

}
