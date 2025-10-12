package chapter_15;

import java.util.*;

public class project_09 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")// @SuppressWarnings requires a parameter
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(n);
        // Java gives a resource leak warning because Scanner uses an input stream
        // (System.in) that ideally should be closed. But closing System.in can cause
        // issues later, so in small programs we suppress the warning instead of closing
        // it.
    }
}
