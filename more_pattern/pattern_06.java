package more_pattern;

public class pattern_06 {
    public static void main(String[] args) {
        int i, j;
        int count = 1;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(count + "\t");
                count++;
            }
            
            
            System.out.print("\n");
        }
    }
}
