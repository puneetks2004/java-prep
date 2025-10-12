package imp;

import java.util.Scanner;

public class project_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n / 2; // space assigned as n/2 i.e. in 1st line n/2 amount of space
        int star = 1; // initialized as 1 because in starting prints 1 star only

        for (int i = 1; i <= n; i++) // i is no. of rows,,,,,,,this loop runs for no. of rows
        {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t"); // \t for stars printing
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
            System.out.println("\n");
        }
        scn.close();
    }
}
