//arraylist

package javaCollections;

import java.util.*;

public class project_01 {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();

        //this is ok because list is interface and arrayList is class implementing it
        // ArrayList<Integer> list = new List<>();//this is wrong
        list.add(10);
        list.add(30);
        list.add(44);
        list.add(220);
        list.add(3220);
        list.add(442);
        //to remove value at index 2
        list.remove(2);

        System.out.println(list);

        list.remove(Integer.valueOf(442));//removes value 442 if present in list else do nothing
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(22);
        list2.add(3433);
        list2.add(87);

        System.out.println(list2);

        //finally to add both the list and make final single list
        list.addAll(list2);
        System.out.println(list);




        
    }
}