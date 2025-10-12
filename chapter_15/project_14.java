//static methods
package chapter_15;

class ghmega {

    String name = "anuj";
    static String name2 = "puneet";

    public void get1() {
        System.out.println("hi i am " + name);
    }

    public static void get() {
        System.out.println("hi i am " + name2);
    }

    public void get3() {
        System.out.println("hi i am " + name2);
    }
}

public class project_14 {
    public static void main(String[] args) {

        // normally----->instance variables can be used with instance methods of class
        // and can be called normally by creating objects and then calling
        ghmega obj1 = new ghmega();
        obj1.get1();

        // to call static variables you have to use static methods only and can be
        // called directly by class name
        ghmega.get();

        // normal method can take static variables
        obj1.get3();
    }
}
