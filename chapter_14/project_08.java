//Exception class in java
package chapter_14;

import java.util.*;

class high extends Exception {
   
    public String toString() {//overridding methods
        return super.toString()+" I am toString()";//modifying message
    }

    public String getMessage() {//overridding methods
        return super.getMessage()+" I am getMessage()";//modifying message
    
    }
}

public class project_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = scn.nextInt();

        if (a < 9) {
            try {
                high obj = new high();//means "Throw an object of type high as an exception."
                throw obj;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }

        scn.close();
    }
}

//output----------due to javas internal behaviour
//null I am getMessage()
//chapter_14.high: null I am getMessage() I am toString()
//chapter_14.high: null I am getMessage() I am toString()