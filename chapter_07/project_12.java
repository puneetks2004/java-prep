package chapter_07;      //method overloading

public class project_12 {
    
    static void change(int x,int y)
    {
        System.out.println("the value of a is " + x);
        System.out.println("the value of b is " + y);
        

    }

    static void change()
    {
        System.out.println("hello all");
    }

    static void change(int o)
    {
        System.out.println("the value of a is " + o);
    }

    // static void change(int m) {
    //     System.out.println("the value of a is " + m);
    // }
    
    public static void main(String[] args)
    {
        change(2, 3);
        change();
        change(456);
        change(55);       //again goes to same function on call
    }
}
