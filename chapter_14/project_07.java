//nested try and catch block
package chapter_14;

import java.util.*;

public class project_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the value of array");
        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.println("Allot values to array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        try {
            System.out.println("enter index whose value to find");
            int ind = scn.nextInt();

            try {// try to execute it
                System.out.println("value is :" + arr[ind]);
            } catch (Exception e)// catch any Exception if encountered
            {
                System.out.println("sorry, ArrayIndexOutOfBounds");
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println("Error Encountered");
            System.out.println(e);
        }

        scn.close();

    }
}
