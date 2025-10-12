package more_pattern;

public class pattern_08 {
    public static void main(String[] args) {
        int i, j;
        char count = 'A';

        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                System.out.print(count + "\t");
            }

            count++;
            System.out.print("\n");
        }

    }
}