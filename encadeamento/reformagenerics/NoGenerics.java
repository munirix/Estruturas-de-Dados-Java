package encadeamento.reformagenerics;

public class NoGenerics<T> {
    private T conteudo; //conteúdo da célula
    private NoGenerics<T> proximoNoGenerics;    //ponteiro para a próxima célula

    public NoGenerics(T conteudo) {
        this.proximoNoGenerics = null;   //inicia a referencia do proximo nó como nulo, ou seja, inicia a lista como vazia
        this.conteudo = conteudo;
    }
    //retorna apenas o conteudo da variavel
    public T getConteudo() {
        return conteudo;
    }
    //define um noNoGenericsvo valor/conteudo
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    //retorna o proximo nó
    public NoGenerics<T> getProximoNoGenerics(){
        return proximoNoGenerics;
    }
    //define o proximo nó
    public void setProximoNoGenerics(NoGenerics<T> proximoNoGenerics) {
        this.proximoNoGenerics = proximoNoGenerics;
    }
    //retorna o conteudo da variavel com determinada formatação prevalecente
    @Override
    public String toString() {
        return "NoGenerics{conteudo= ' "+conteudo+" '}";
    }
}
