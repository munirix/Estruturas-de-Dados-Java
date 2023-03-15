package filas;

public class MainFila {
    public static void main(String[] args){

        Fila<String> minhaFila = new Fila<>();
        
        //minhaFila.enqueue(0); erro!!!
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
/*        
minhaFila.enqueue(new NoFila("teste"));
o metodo recebia o nó e não apenas o conteudo

 era :
    public void enqueue(NoFila novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    
para mudar isso foi implementado:

    public void enqueue(T object){
        NoFila novoNo = new NoFila(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

*/

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }
}
