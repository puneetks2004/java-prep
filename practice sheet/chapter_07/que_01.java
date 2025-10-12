package chapter_07;

public class que_01 {

    static int table(int x)    //can also use void instead of  int
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(+x + " * " + i + " = " + x * i);
        }
        return (0);
    }
    public static void main(String[] args)
    {
        int n = 5;
        table(n);
    }
}
