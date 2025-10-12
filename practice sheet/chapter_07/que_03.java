package chapter_07;

public class que_03 {              //normal way without recursion

    static int sum(int x) 
    {

        int result=0;
        for (int i=1;i<=x;i++)
        {
            result = result + i; //sum keeps on calculating and storing in result

        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args)
    {
        sum(100);
    }
}
