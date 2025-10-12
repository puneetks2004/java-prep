package more_pattern;

public class pattern_18 {
    public static void main(String[] args) {
        int i, j;
        int value = 1;
        int space = 0;

        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(value + "\t");
            }
            space++;
            value++;
            System.out.println();
        }
    }
}
