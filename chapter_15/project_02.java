//ArrayList in java
package chapter_15;

import java.util.*;

public class project_02 {
    public static void main(String[] args)
    {
        ArrayList<Integer> ll = new ArrayList<>();

        ll.add(23);
        ll.add(2323);
        ll.add(9823);
        ll.add(2783);
        ll.add(53);
        
        //to get size
        System.out.println(ll.size());

        //to print whole arrayList
        System.out.println(ll);
        ll.add(0, 3333);
        
        //to add a element at 0 index
        System.out.println(ll);
    }
}
