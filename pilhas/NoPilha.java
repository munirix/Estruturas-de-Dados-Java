package pilhas;

public class NoPilha {
    private int dado;
    private NoPilha proximoNo= null;

    public NoPilha(){

    }
    public NoPilha(int dado){
        this.dado = dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }
    public int getDado() {
        return dado;
    }
    public void setProxNoPilha(NoPilha proximoNo) {
        this.proximoNo = proximoNo;
    }
    public NoPilha getProxNoPilha() {
        return proximoNo;
    }
    @Override
    public String toString(){
        return "NoPilha {Dado = "+dado+"}";
    }
}
