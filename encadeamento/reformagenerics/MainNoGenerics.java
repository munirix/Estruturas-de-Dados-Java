package encadeamento.reformagenerics;

public class MainNoGenerics {
    public static void main(String[] args) {
        NoGenerics<String> noGNoGenerics1 = new NoGenerics<>("generics nó1");
        NoGenerics<String> noGNoGenerics2 = new NoGenerics<>("generics nó2");
        noGNoGenerics1.setProximoNoGenerics(noGNoGenerics2);

        NoGenerics<String> noGNoGenerics3 = new NoGenerics<>("generics nó3");
        noGNoGenerics2.setProximoNoGenerics(noGNoGenerics3);

        NoGenerics<String> noGNoGenerics4 = new NoGenerics<>("generics nó4");
        noGNoGenerics3.setProximoNoGenerics(noGNoGenerics4);

        //noGNoGenerics1->noGNoGenerics2->noGNoGenerics3->noGNoGenerics4->null

        System.out.println(noGNoGenerics1);
        System.out.println(noGNoGenerics1.getProximoNoGenerics());
        System.out.println(noGNoGenerics2);
        
        noGNoGenerics1.setConteudo("NoGenericsvo generics noGNoGenerics1");

        System.out.println("------------------------");
        
        System.out.println(noGNoGenerics1);
        System.out.println(noGNoGenerics1.getProximoNoGenerics());
        System.out.println(noGNoGenerics1.getProximoNoGenerics().getProximoNoGenerics());
        System.out.println(noGNoGenerics1.getProximoNoGenerics().getProximoNoGenerics().getProximoNoGenerics());
        System.out.println(noGNoGenerics1.getProximoNoGenerics().getProximoNoGenerics().getProximoNoGenerics().getProximoNoGenerics());
    }
}
