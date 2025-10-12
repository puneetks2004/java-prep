package more_pattern;

import java.util.Scanner;



public class pattern_37 {
    public static void main(String[] args) {
        int i, j;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print("*\t");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print("\t");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print("\t");
            }
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*\t");
            }
            for(j=1;j<=n-i;j++)
            {
                System.out.print("\t");
            }
            for(j=1;j<=n-i;j++)
            {
                System.out.print("\t");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }
}
