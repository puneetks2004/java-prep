package imp;      //palindrome number

import java.util.*;

public class project_14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of number");
        int number = scn.nextInt(); // taking number from user
        scn.close();
        int val;
        int sum = 0;
        int original_number = number;
        while(number>0)
        {
            val = number % 10;//gives remainder
            sum = (sum * 10) + val;
            number = number / 10; //gives shortened number next time

        }
        if(sum==original_number)
        {
            System.out.println("the number is palindrome");
        }
        else {
            System.out.println("number is not palindrome");
        }

    }
}
