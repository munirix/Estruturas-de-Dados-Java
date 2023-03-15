package filas;
/** NoFila:
 * é o primeiro arquivo feito.
 * é a base para montar o arquivo Fila.
 */
public class NoFila<T> {
    //private Object object;
    private T object;
    private NoFila<T> refNoFila;

    public NoFila(){
    }
//cria um novo nó
    public NoFila(T object){
        this.refNoFila = null;
        this.object = object;
    }
//retorna o objeto do nó
    public Object getObject() {
        return object;
    }
//defii um objeto para o nó
    public void setObject(T object) {
        this.object = object;
    }
//retorna a referencia do nó na fila
    public NoFila getRefNoFila() {
        return refNoFila;
    }
//define a referencia do nó na fila
    public void setRefNoFila(NoFila refNoFila) {
        this.refNoFila = refNoFila;
    }

    @Override
    public String toString() {
        return "NoFila{" +
                "object=" + object +
                '}';
    }
}
