//Specefic Exception handling by multiple catch blocks 
package chapter_14;

import java.util.*;

public class project_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[4];// array of size 4 created
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 33;
        arr[3] = 88;
        
        System.out.println("Enter the value of index");
        int val = scn.nextInt();

        // each catch handels specefic type of exception , and remainig are handeled by
        // last catch statement, although all exception can be handeled by last catch but to specefically add extra we do this

        try {
            System.out.println("devision is : " + arr[val] / 0);
        } catch (ArithmeticException e) {
            System.out.println("arithmetic Exception occurred");
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("error occurred");
        }

        scn.close();
    }
}