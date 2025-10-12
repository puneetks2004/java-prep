package chapter_04;

import java.util.Scanner;

public class que_03 {
    public static void main(String[] args )
    {
        Scanner value = new Scanner(System.in);
        System.out.println("enter your salary");
        float salary = value.nextFloat();
        if (salary <= 250000)
        {
            System.out.println("you dont have to pay tax");
        }
        else if (salary > 250000  && salary<=500000)
        {
            float percent = 0.05f * salary;
            System.out.println("tax to be paid by you is " + percent);

        }
        else if (salary >500000 && salary <= 1000000) {
            float percent_01 = 0.2f * salary;
            System.out.println("tax to be paid by you is " + percent_01);

        }
        else if (salary > 1000000 ) {
            float percent_02 = 0.3f * salary;
            System.out.println("tax to be paid by you is " + percent_02);

        }


        value.close();
    }
}
