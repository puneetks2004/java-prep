package chapter_07;

public class project_05 {

    static int result(int x,int y)
    {
        int m;

        if(x>=y)
        {
            m = x + y * y;
             
        }
        else 
        {
            m = x * y + 890;
            
        }
        return (m);
        
    }
    public static void main(String[] args)
    {
        int a = 8;
        int b = 7;
        int c = result(a, b);
        System.out.println(c);
        
    }
}
