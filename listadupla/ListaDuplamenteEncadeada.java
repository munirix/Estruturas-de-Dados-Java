package listadupla;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    /**para que não tenha que varrer toda a lista para saber seu tamanho, foi criada uma variavel*/
    private int tamanhoLista = 0;

/**Adiciona um elemento na estremidade da lista */
    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setNoProximo(null);//o proximo é null, já que é adicionado na extremidade
        novoNo.setNoPrevio(ultimoNo);//o anterior é o antigo ultimo nó
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;//incrementa tamanho da lista
    }
/**Adiciona um elemento em um index definido da lista */
    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if(novoNo.getNoProximo() != null){//inserção no meio da lista
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else {//inserção no ultimo index da lista
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }
        if(index == 0){//inserção no primeiro index da lista
            primeiroNo = novoNo;
        }else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;//incrementa tamanho da lista
    }
/**Remove nó pelo index */
    public void remove(int index){
        if(index == 0){//remoção do primeiro nó
            primeiroNo = primeiroNo.getNoProximo();
            //caso agora o primeroNo seja diferente de nulo ainda tem esses passos:
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
                //faz com que haja a perda de conexão com o anterior (eternamente perdido)
            }
        }else{//remoção index != 0
            NoDuplo<T> noAuxiliar = getNo(index);
            //peguei meu nó auxilir (2) no index que quero remover
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            //pega a ref ao anterior ao aux (1) e define ela a ref do proximo como o proximo do aux(3)
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
                //define a ref previa do nó posterior ao aux (3) como o anterior ao aux (1)
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;//decrementa tamanho da lista
    }
/**Retorna conteudo do nó pelo index */
    public T get(int index){
        return getNo(index).getConteudo();
    }
/**Método interno. Retorna um nó duplo pelo index
 */
    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){//duas condições de parada
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No { conteudo = " + noAuxiliar.getConteudo() +" } ]--->\n";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
