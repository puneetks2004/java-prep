package imp;

import java.util.Scanner;

public class project_11 {
    public static void amin(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.println("enter any number from 1 to 10");
        int number = value.nextInt();

        int space = 0;

        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.print("\n");
            space++;

            value.close();
        }

    }
}
