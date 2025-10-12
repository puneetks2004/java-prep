package more_pattern;

import java.util.Scanner;

public class pattern_38 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int i, j;
        
        for (i = 1; i <= n; i++) {
            char count = 'A';
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(count + "");
                count = (char) (count + 1);
            }

            System.out.print("\n");
        }
        
        for(i=1;i<=n-1;i++)
        {
            char count = 'A';
            for(j=1;j<=i+1;j++)
            {
                System.out.print(count + "");
                count = (char) (count + 1);
            }
            System.out.print("\n");
        }
    }
}