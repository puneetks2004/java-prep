package imp;

import java.util.Scanner;

public class project_03 {
    public static void main(String[] args) // leap year
    {
        Scanner value = new Scanner(System.in);
        System.out.println("enter year of your choice");
        int year = value.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0)

            {
                if (year % 400 == 0) {
                    System.out.println("leap year");
                } else {
                    System.out.println("not a leap year");
                }
            } else {
                System.out.println(" leap year");
            }

        } else {
            System.out.println("not a leap year");
        }
        value.close();
    }
}
