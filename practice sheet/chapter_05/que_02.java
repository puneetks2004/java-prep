package chapter_05;

public class que_02 {
    public static void main(String[] args)
    {
        int i;
        int sum=0;
        int n=0;
        for(i=0;i<=10;i=2*n)
        {
            System.out.println(i);
            n++;
            sum = sum + i;

        }
      System.out.println(sum);
    }
}
