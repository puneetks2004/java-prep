package more_pattern;

import java.util.Scanner;

public class pattern_27 {
    public static void main(String[] args)
    {
        Scanner Scn=new Scanner(System.in);
        int n=Scn.nextInt();
        int i, j;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
