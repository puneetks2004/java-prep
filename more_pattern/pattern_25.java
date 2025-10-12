package more_pattern;

public class pattern_25 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        int val = n;
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(j + "\t");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print("*\t");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print("*\t");
            }
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(val + "\t");
                val--;
            }
            val = n - i;
            System.out.println();
        }
    }
}
