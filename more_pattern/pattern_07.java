package more_pattern;

public class pattern_07 {
    public static void main(String[] args) {
        int i, j, value;

        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                value = i - j + 1;
                System.out.print(value);
                

            }
            System.out.println();
        }
    }
}
