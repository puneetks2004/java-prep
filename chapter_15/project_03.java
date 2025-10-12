//LinkedList in java
package chapter_15;

import java.util.*;

public class project_03 {
    public static void main(String[] args)
    {
        LinkedList<Integer> mad = new LinkedList<Integer>();

        //to add elements
        mad.add(34);
        mad.add(32);
        mad.add(78);
        mad.add(76);
        mad.add(33278);
        mad.add(716);

        //to get size
        System.out.println(mad.size());

        //to print
        System.out.println(mad);

        //to add in first
        mad.addFirst(4567);
        System.out.println(mad);

        //to add in last
        mad.addLast(3333);
        System.out.println(mad);

        //to get last element
        System.out.println(mad.getLast());

        //to get first element
        System.out.println(mad.getFirst());

        //to get element present at a perticular index
        System.out.println(mad.get(3));

        //to add element at perticular index
        mad.add(3,90);
        System.out.println(mad);

        //remove element at last
        mad.removeLast();
        System.out.println(mad);

        //remove from first
        mad.removeFirst();
        System.out.println(mad);

        //index of a perticular element not present
        System.out.println(mad.indexOf(44));//returns -1

        //index of a perticular element present
        System.out.println(mad.indexOf(76));

        //check wheather contains element or not
        System.out.println(mad.contains(8888));
        
        //remove all element of linked list
        mad.clear();
        System.out.println(mad);




    }
}
