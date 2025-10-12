package more_pattern;

public class pattern_20 {
    public static void main(String[] args) {
        int i, j;
        int space = 0;
        int vote = 10;
        int note;                        //specific solution
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            note = i;
            for (j = 1; j <= vote; j++) {
                System.out.print(note + "\t");
                note++;
            }
            vote--;
            space++;
            System.out.print("\n");
        }
    }
}
