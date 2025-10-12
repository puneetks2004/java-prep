//ArrayDequeue------------>double-ended-queue
package chapter_15;

import java.util.*;

public class project_04 {
    public static void main(String[] args) {
        ArrayDeque<String> low = new ArrayDeque<String>();// creation

        // to add elements
        low.add("e");
        low.add("o");
        System.out.println(low);

        // to add elements at start
        low.addFirst("t");
        System.out.println(low);

        // to add at last
        low.addLast("y");
        System.out.println(low);

        // to remove from first
        System.out.println(low.removeFirst());

        // to remove last
        System.out.println(low.removeLast());

        // to find element at peak from frontend
        System.out.println(low.peekFirst());

        // to find element at peak from Backtend
        System.out.println(low.peekLast());

        // to check if empty or not
        System.out.println(low.isEmpty());

        // to clear out all values and make empty
        low.clear();
        System.out.println(low);

    }

}
