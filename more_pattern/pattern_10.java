package more_pattern;

public class pattern_10 {
    public static void main(String[] args) {
        int i, j;
        char value = 'A';

        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                System.out.print(value + "\t");
                value++;
            }
            System.out.println();
        }
    }
}
