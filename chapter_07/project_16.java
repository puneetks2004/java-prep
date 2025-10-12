package chapter_07;

public class project_16 {

    static int factorial(int x) {
        if (x == 0 || x == 1) // if 0 or 1 than stop and print value as 1
        {
            return 1;

        } else {

            return x * factorial(x - 1);     //recursion taking place
        }
    }

    public static void main(String[] args) {

        System.out.println("factorial of n is " + factorial(5));
    }
}
