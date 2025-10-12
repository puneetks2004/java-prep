package imp;

import java.util.Scanner;

public class project_10 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i, j;
        int space = 0;
        for (i = n; i >=1; i--) {
            for (j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.print("\n");
            space++; // space is increamenting gradually
        }
    }
}
