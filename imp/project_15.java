package imp; //wap to reverse given digits and print

import java.util.Scanner;

public class project_15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scn.nextInt();
        int sum = 0;
        scn.close();
        int val;
        while (number > 0) {
            val = number % 10;// for remainder
            sum = (sum * 10) + val;

            number = number / 10;// for shortening number
        }

        System.out.println("reverse of given number is " + sum);

    }
}
