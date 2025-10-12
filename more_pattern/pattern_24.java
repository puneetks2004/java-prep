package more_pattern;

import java.util.Scanner;

public class pattern_24 {
    public static void main(String[] args) {
        int i, j;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n - 1;
        int count = 1;
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (j = 1; j <= i; j++) {

                System.out.print(j + "\t");

            }
            count = i - 1;
            for (j = 1; j <= i - 1; j++) {

                System.out.print(count + "\t");
                count--;
            }

            space--;
            System.out.print("\n");
        }

    }
}
