package more_pattern;

public class pattern_16 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        int space = n - 1;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println("\n");
            space--;
        }

    }
}