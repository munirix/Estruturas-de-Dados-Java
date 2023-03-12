package atribuicaoreferencia;
/**
 * AtribuicaoReferencia
 */
public class AtribuicaoReferencia {

    public static void main(String[] args) {
        int a = 1;
        int b = a;
        System.out.println("a = "+a+"\tb = "+b);
        a = 2;
        System.out.println("a = "+a+"\tb = "+b);
        /*
        - Com tipo primitivo, copiamos o valor em memória;
        (não copia a referencia, copia exatamente o valor de memoria de uma variavel a outra)
         */
        
        AtribuicaoReferenciaObj objA = new AtribuicaoReferenciaObj(1);
        AtribuicaoReferenciaObj objB = objA;
        
        System.out.println("A = "+objA+"\tB = "+objB);
        
        objA.setNum(2);

        System.out.println("A = "+objA+"\tB = "+objB);
        /*
        - Com objetos copiamos o valor da referência em memória, sem duplicar o objeto.
        (tanto o objA quanto o objB estarão apontando para o mesmo endereço de memoria)
         */
    }
}
