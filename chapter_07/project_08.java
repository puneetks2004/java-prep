package chapter_07;

public class project_08 {
    static int  change(int y)
    {
        y = 99;
        return (y);
    
    }
    public static void main(String[] args)
    {
        int x=90;
        change(x);  //function call
        System.out.println(x); //output as 90 since a copy
    }
}
