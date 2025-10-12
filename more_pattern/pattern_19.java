package more_pattern;

import java.util.Scanner;

public class pattern_19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i, j;
        int n = scn.nextInt();
        
        for (i = 1; i <= n; i++) {
            int count = i;
            for (j = 1; j < i; j++) {
                System.out.print("\t");
            }
            for (j = 1; j <= n - i + 1; j++) {

                System.out.print(count + "\t");
                count++;

            }
            System.out.print("\n");
        }
        
        scn.close();
    }
}
