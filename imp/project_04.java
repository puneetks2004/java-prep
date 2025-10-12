package imp;

import java.util.Scanner;

public class project_04 {
    public static void main(String[] args)
    {
        Scanner value = new Scanner(System.in);
        
        System.out.println("enter any number");
        int number = value.nextInt();
        int i;
        int sum = 1;
        for(i=number;i>=1;i--)
        {
            sum = sum * i;
        }

        System.out.println("the factorial of  " + number + " is " + sum);
       
        value.close();
    }
}
