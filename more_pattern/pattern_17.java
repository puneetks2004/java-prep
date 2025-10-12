package more_pattern;

public class pattern_17 {
    public static void main(String[] args)
    {
         int i,j;
         int space = 0;
         
         for(i=4;i>=1;i--)
         {
            for(j=1;j<=space;j++)//space will increase gradually
            {
                System.out.print("\t");
            }
            for (j = 1; j <= i;j++) //stars will keep on decreasing
            {
                System.out.print("*\t");
            }
            space++;
            System.out.println();
         }
    }
}
