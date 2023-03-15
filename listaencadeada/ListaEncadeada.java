package listaencadeada;

public class ListaEncadeada<T> {
    private NoLE<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }
/**Adiciona um novo nó na lista. Não há a opção de inserir em um index */
    public void add(T conteudo){
        NoLE<T> novoNoLE = new NoLE(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNoLE;
            return;
        }
        NoLE<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size() - 1; i++){
            noAuxiliar = noAuxiliar.getProximoNoLE();
        }
        noAuxiliar.setProximoNoLE(novoNoLE);
    }
/**acha o nó pelo [index] e retorna o conteudo */
    public T get(int index){
        return getNoLE(index).getConteudo();
    }
/**retorna o nó pelo [index] */
    private NoLE<T> getNoLE(int index){
        validaIndice(index);//valida se esse index existe
        NoLE<T> noAuxiliar = referenciaEntrada;
        NoLE<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNoLE();
        }
        return noRetorno;
    }
/**retorna o conteudo do nó que ele removeu */
    public T remove(int index){
        validaIndice(index);//valida se esse index existe
        NoLE<T> noPivor = getNoLE(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProximoNoLE();//referencia de entrada aponta pro segundo nó, excluindo assim o primeiro
            return noPivor.getConteudo();
        }
        NoLE<T> noAnterior = getNoLE(index - 1);
        noAnterior.setProximoNoLE(noPivor.getProximoNoLE());
        //a referencia do proximo nó do noAnterior vai ser a referencia de nó do noPivor, excluindo o noPivor
        
        //noAnterior      no Pivor            noPivor.getProximoNoLE()
        //ref ---> 4*     2 - ref ----> 4     4* - ref ---> 6
        //                (sem encadeamento)
        return noPivor.getConteudo();
    }
/**vai retornar o tamanho da lista */
    public int size(){
        int tamanhoLista = 0;
        NoLE<T> referenciaAux = referenciaEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNoLE() != null){
                    referenciaAux = referenciaAux.getProximoNoLE();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }
/**valida se o index realmente existe na lista */
    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo noLE índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
        }
    }
/**isEmpty: retorna se a lista esta vazia ou não */
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    public NoLE<T> getReferenciaEntrada() {
        return referenciaEntrada;
    }

    public void setReferenciaEntrada(NoLE<T> referenciaEntrada) {
        this.referenciaEntrada = referenciaEntrada;
    }

    @Override
    public String toString() {
        String strRetornoLE = "";
        NoLE<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            strRetornoLE += "[NoLE{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getProximoNoLE();
        }
        strRetornoLE += "null\n\n";
        return strRetornoLE;
    }
}
