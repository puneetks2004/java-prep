package more_pattern;

public class pattern_14 {
    public static void main(String[] args) {
        int i , j;
        char value = 'A';
        
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                value = (char) ('A' + i + j - 2);
                System.out.print(value+"\t");

                
            }
            System.out.print("\n");
        }

    }
}
