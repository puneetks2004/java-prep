package chapter_04;

public class project_02 {
    public static void main(String[] args)
    {
        int number = 30;

        if(number<=10)
        {
            System.out.println("less than 10");
        }
        else if(number>10 && number<20)
        {
            System.out.println("number is greater than 10");
        }
        else if(number>20 && number<30)
        {
            System.out.println("the number is greater 20");
        }
        else
        {
            System.out.println("enter a valid number");
        }
    }
}
