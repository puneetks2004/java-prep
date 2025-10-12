//final keyword in variable
package chapter_15;

public class project_10 {
    public static void main(String[] args)
    {
        //can easily alter
        // int val = 99;
        // val = 90;
        // System.out.println(val);


        final int val = 23;
        // val = 99;------------------>cannot be reinitialized
        System.out.println(val);
    }
}
