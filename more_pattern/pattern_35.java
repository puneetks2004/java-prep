package more_pattern;

import java.util.Scanner;

public class pattern_35 {
    public static void main(String[] args) {
        int i, j;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            int val = i;
            for (j = 1; j <= i; j++) {

                System.out.print(val + "\t");
                val--;
            }
            count = 2;
            for (j = 2; j <= i; j++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.print("\n");
        }

        scn.close();
    }
}
