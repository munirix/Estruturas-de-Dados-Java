package listaencadeada;

public class NoLE<T> {
    private T conteudo;
    private NoLE proximoNoLE = null;

    public NoLE(T conteudo){
        this.conteudo = conteudo;
    }

    public NoLE(T conteudo, NoLE proximoNoLE) {
        this.conteudo = conteudo;
        this.proximoNoLE = proximoNoLE;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoLE getProximoNoLE() {
        return proximoNoLE;
    }

    public void setProximoNoLE(NoLE proximoNoLE) {
        this.proximoNoLE = proximoNoLE;
    }

    @Override
    public String toString() {
        return "NoLE{" + conteudo + '}';
    }
/**toStringEncadeado : imprime toda a lista */
    public String toStringEncadeado() {
        String str = "NoLE{" + conteudo + "}";

        if(proximoNoLE != null){
            str += "->" + proximoNoLE.toString();
        }else{
            str += "->null";
        }
        return str;
    }
}
