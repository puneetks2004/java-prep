package more_pattern;

public class pattern_11 {
    public static void main(String[] args)
    {
        int i, j;
        char value = 'A';

        for(i=1;i<=3;i++)
        {
            for (j=1;j<=3;j++)
            {
                System.out.print(value+"\t");
                value++;
            }

            value-=2;
            System.out.println();
        }
    }
}

