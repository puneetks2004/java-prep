package imp;
                                       //swap in two variables
public class project_01 {
    public static void main(String[] args)
    {
        int a = 100;
        int b = 200;
        System.out.println("Before swap a is " + a + " and b is " + b);
        
         b = b - a;
         a = a + b;
        System.out.println("after swapping a is "+a+" b is "+b);
    }
}
