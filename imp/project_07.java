package imp;
import java.util.Scanner;
public class project_07 {
    public static void main(String[] args)
    {
        Scanner value = new Scanner(System.in);
        System.out.println("enter any number");
        int number = value.nextInt();

        int i;

        for(i=2;i<number;i++) //last value of i is number itself
        {
            if (number % i == 0) {
                System.out.println("not a prime");
                break;
            }

        }
        
        if (i == number) {
            System.out.println("a prime number");
        }
        value.close();
    }
}
