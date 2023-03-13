package encadeamento;

public class No {
    private String conteudo; //conteúdo da célula
    private No proximoNo;    //ponteiro para a próxima célula

    public No(String conteudo) {
        this.proximoNo = null;   //inicia a referencia do proximo nó como nulo, ou seja, inicia a lista como vazia
        this.conteudo = conteudo;
    }
    //retorna apenas o conteudo da variavel
    public String getConteudo() {
        return conteudo;
    }
    //define um novo valor/conteudo
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    //retorna o proximo nó
    public No getProximoNo(){
        return proximoNo;
    }
    //define o proximo nó
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
    //retorna o conteudo da variavel com determinada formatação prevalecente
    @Override
    public String toString() {
        return "No{conteudo= ' "+conteudo+" '}";
    }
}
