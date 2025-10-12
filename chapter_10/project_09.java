package chapter_10;

class bbm {
    public bbm() // constructor without any parameter
    {
        System.out.println("oolalalla");
    }

    public bbm(int a) {

        System.out.println("the value of a is " + a);
    }
}

class ccl extends bbm {

    public ccl() {
        super(98); // super keyword allows to run that constructor of parent with parameter

        System.out.println("my life my rules");
    }

}

public class project_09 {
    public static void main(String[] args) {
        ccl kallu = new ccl(); // object of base class cc

    }
}
