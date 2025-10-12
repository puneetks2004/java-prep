package chapter_07;               //printing the pattern

public class que_02 {

    static void printing(int i) //i=4  //void so not need to return anything
    {
        int j = 1;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

    }
    public static void main(String[] args)
    {

        int n = 4;
        printing(n);

    }
}
