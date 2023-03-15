package filas;
/** Fila ( FIFO : First in, First out):
 * é o segundo arquivo feito.
 * é a base para montar o arquivo Main.
 */
public class Fila<T> {
    private NoFila<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;//quando instanciar minha fila ela será nula
    }
    /**enqueue(enfilerar): coloca mais um elemento na fila na posição correta, final
     */
    public void enqueue(T object){
        NoFila novoNo = new NoFila(object);//cria o nó e coloca o valor do objeto pelo parametro
        novoNo.setRefNoFila(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    /**first: retorna o primeiro nó da fila
     */
    public T first(){
        if(!this.isEmpty()){//se a fila não estiver vazia
            NoFila primeiroNo = refNoEntradaFila;
            while (true){//loop até chegar no primeiro da fila
                if(primeiroNo.getRefNoFila() != null){//se não for o primeiro
                    primeiroNo = primeiroNo.getRefNoFila();//pega ref do prox no da fila
                }else{//quebra o loop quando for o primeiro
                    break;
                }
            }
            return (T) primeiroNo.getObject();//retorna o novo primeiro objeto do no
        }
        return null;
    }
    /**dequeue 
     (desenfilerar): 
     Alem de retornar o primeiro nó, tambem tira o primeiro elemento(pega o imediantamente anterior do primeiro e aponta para nulo).
     */
    public T dequeue(){
        if(!this.isEmpty()){
            NoFila primeiroNo = refNoEntradaFila;
            NoFila noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNoFila() != null){
                    noAuxiliar = primeiroNo;//imediatamente anterior
                    primeiroNo = primeiroNo.getRefNoFila();//desse no
                }else{
                    noAuxiliar.setRefNoFila(null);//agora ele aponta para nulo
                    break;
                }
            }
            return (T) primeiroNo.getObject();//retorna o novo primeiro objeto do no
        }
        return null;
    }
    /**isEmpty: verifica se a fila é vazia
     */
    public boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No {objeto = " + noAuxiliar.getObject() + "}]  --->\n";
                if(noAuxiliar.getRefNoFila() != null){
                    noAuxiliar = noAuxiliar.getRefNoFila();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
