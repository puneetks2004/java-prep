package imp; //armstrong number

import java.util.*;

public class project_16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of number");
        int number = scn.nextInt();
        int original_number = number;
        int original_num = number;
        scn.close();
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        int val;
        int sum = 0;
        while (original_num > 0) {
            val = original_num % 10;
            sum = (int) (sum + Math.pow(val, count));
            original_num = original_num / 10;

        }

        if (sum == original_number) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not a armstrong number");
        }

    }
}
