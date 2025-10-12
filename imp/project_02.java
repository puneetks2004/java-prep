package imp;

public class project_02 {
    public static void main(String[] args)        //swap using three variables
    {
        int a = 100;
        int b = 200;
        int temp;
        System.out.println("before swap a is " + a + " b is " + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("after swap a is "+a+" b is "+b);
        
    }
}
