package chapter_07;

public class project_09 {
    static int  change(int y)
    {
        y = 99;
        return (y);
    
    }
    public static void main(String[] args)
    {
        int x=90;
        change(x);  //function call
        System.out.println(change(x)); //output as 99 since  x is send to y and we are reassigning x
    }
}


