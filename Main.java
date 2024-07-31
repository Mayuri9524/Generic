import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Generic Class");
        // Generic is only for the wrapper class or we can say for objects.
        Integer A=10;
        Box B = new Box();
        B.addContent(A);
        Object N=B.getContent();
        System.out.println(N);

        // Generic Method
        System.out.println("Generic methods");
        Integer[] arr= {1,2,3,4,5,6,7};
        Utilh M = new Utilh();
        M.printArray(arr);

        //Generic Wild Card <?>
        System.out.println("WildCard in Generics");
        ArrayList<String> Array = new ArrayList<>();
        Array.add("Mayuri");
        Array.add("Sohamm");
        Array.add("Kapte");
        Wild W = new Wild();
        W.printList(Array);

        // Bounded Generics
        //Method accepts a type and all its subclass is called upperbound
        System.out.println("UpperBound");
        NumberBox n = new NumberBox(10);
        System.out.println(n.getContent());
        System.out.println(n.hashCode());

        // Generic Interface
        Integer L=10;
        String str ="Mayuri";
        OrderPair o= new OrderPair(str,L);
        System.out.println(o.getKey());
        System.out.println(o.getValue());

        // RAW use of a Hashmap
        HashMap hm = new HashMap();
        hm.put("Mayuri",1);

        System.out.println("Mayuri "+hm.get("Mayuri"));
    }


}