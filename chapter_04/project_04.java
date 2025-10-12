package chapter_04;

public class project_04 {
    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a && b && c) {
            System.out.println("if all true");
        }
        if (a && c) {
            System.out.println("the value is true");
        }

        if (a || b) {
            System.out.println("logical or");
        }
        if (a || b || c) {
            System.out.println("the value evaluates to true");
        }

        if (a!=b)
        {
            System.out.println("got it");
        }
    }
    
}
