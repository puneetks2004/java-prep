package chapter_07;

public class project_17 {

    static int factorial(int x) {
        int number = 1;

        for (int i = 1; i <= x; i++)

        {
            number = number * i;

        }
        return number;
    }

    public static void main(String[] args)
    {
System.out.println("the factorial is " +factorial(6));
    }
}
