//Hashset------implementation
package chapter_15;

import java.util.*;

public class project_05 {
    public static void main (String[] args)
    {
        HashSet<Integer> bb = new HashSet<Integer>();

        //to add element
        bb.add(67);
        bb.add(78);
        bb.add(66);
        bb.add(24);

        //to display
        System.out.println(bb);

        //to remove
        bb.remove(78);
        System.out.println(bb);

        //to remove element that is not present in hashset
        bb.remove(77);//will simply print same set
        System.out.println(bb);

        //checks if contains or not
        System.out.println(bb.contains(67));

        //for size
        System.out.println(bb.size());

        //to clear
        bb.clear();
        System.out.println(bb);

    }
    
}
