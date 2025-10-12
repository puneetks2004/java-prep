package chapter_07;

public class que_04 {

    static void printing_pattern(int i)
    {

        for (i=1;i<=4;i++)
        {
            for(int j=4; j>=i;j--)
            {
                System.out.print(" * ");

            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)

    {
        printing_pattern(1);
    }
}