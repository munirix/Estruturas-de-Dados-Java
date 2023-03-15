package pilhas;
/**Pilha(LIFO: Last in, Fisrt out) */
public class Pilha {
    private NoPilha refNoEntradaPilha=null;
/**pop: exclui o nó do topo e imprime o mesmo nó, caso exista uma pilha */
    public NoPilha pop(){
        if(!this.isEmpty()){//se a pilha n estiver vazia
            NoPilha noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getProxNoPilha();//a referencia de inicio é a referencia de nó do nó excluido
            return noPoped;
        }
        return null;
    }
/**push: Adiciona um novo nó acima do anterior, formando assim uma pilha
 */
    public void push(NoPilha novoNo){
        NoPilha refAuxiliar = refNoEntradaPilha;//guarda a referencia de topo
        refNoEntradaPilha = novoNo;//seta uma nova referencia na pilha
        refNoEntradaPilha.setProxNoPilha(refAuxiliar);//a antigo referencia de topo agora esta embaixo do novo topo
    }

    public NoPilha top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }
    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        NoPilha noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getProxNoPilha();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
