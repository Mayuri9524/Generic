import java.util.*;
public class Wild {
    // The WildCard "?" is used to represent unknown
    public void printList(List<?> list)
    {
        for(Object item: list)
        {
            System.out.println(item);
        }
        System.out.println(" ");



    }
}
