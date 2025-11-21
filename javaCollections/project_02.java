//arraylist
package javaCollections;

import java.util.*;

public class project_02 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6));
        //to quicl;y assign values to arraylist

        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 3, 2, 5, 6, 7));

        System.out.println(list2);

        //to remove common elements from list1
        list1.removeAll(list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
