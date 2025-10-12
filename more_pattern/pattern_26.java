package more_pattern;

public class pattern_26 {
    public static void main(String[] args) {
        int i, j, m = 4, n = 5;

        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n; j++) {
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.print("\n");

        }
    }
}
