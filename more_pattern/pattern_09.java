package more_pattern;

public class pattern_09 {
    public static void main(String[] args) {
        
        int i,j;
        

        for(i=1;i<=4;i++)
        {
            char value = 'A';
            for(j=1;j<=4;j++)
            {
                System.out.print(value+"\t");
                value++;
            }
            System.out.println();
        }
    }
}
