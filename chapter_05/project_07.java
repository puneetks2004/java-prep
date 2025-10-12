package chapter_05;

public class project_07 {
    public static void main(String[] args)
    {
        int i;
        int n=0;
        for (i = 0; i <= 50; i = 2 * n) //even numbers
        {
            System.out.println(i);
            n++;
        }

        int j;
        int y = 0;
        for (j = 1; j <= 50; j = 2 * y + 1)
        {                                 //for odd
            System.out.println(j);
            y++;
        }
    }
}
