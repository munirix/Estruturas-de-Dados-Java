package listacircular;

public class NoCircular<T> {
    private T conteudo;
    private NoCircular<T> noProximo;

    public NoCircular(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoCircular<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(NoCircular<T> noProximo) {
        this.noProximo = noProximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
