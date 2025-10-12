package imp;

public class project_08 {
    public static void main(String[] args)
    {
        int i, j;

        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*\t"); //for space between
            }
            System.out.print("\n");    //for new line
        }
    }
}
