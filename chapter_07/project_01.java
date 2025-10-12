package chapter_07;

public class project_01 {

     static int result(int x, int y)   //function/method
    {
        int z = x * y / x + y;  //included in terms of x and y not in a and b because a and b is not defined here
        return z;            //returns z
    }
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int c = result(a,b);     //goes to result logic return above
        System.out.println(c);
    }
}
