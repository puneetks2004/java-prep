package imp;

import java.util.Scanner;

public class project_05 {
    public static void main(String[] args)
    {
        Scanner value = new Scanner(System.in);
        System.out.println("enter any number");
        int number = value.nextInt();

        int sum = 0;
        int i;

        for (i = number; i >= 1; i--)
        {
            sum = sum + i;
        }

        System.out.println("the sum till " + number + " is " + sum);
        
        value.close();
        
    }
}
