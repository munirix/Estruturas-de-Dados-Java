package atribuicaoreferencia;
/**
 * AtribuicaoReferenciaObj
 */
public class AtribuicaoReferenciaObj {
    Integer num;
    //para iniciar valor
    public AtribuicaoReferenciaObj(Integer num){
        this.num = num;
    }
    //seta valor
    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}