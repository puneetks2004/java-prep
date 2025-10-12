package chapter_10;

class bb {

    public bb() // constructor without any parameter
    {
        System.out.println("oolalalla");

    }

    public bb (int a)
    {

        System.out.println("the value of a is "+a);
    }
}

class cc extends bb {

    public cc() {
        System.out.println("my life my rules");
    }

}

public class project_08 {
    public static void main(String[] args) {
        cc kallu = new cc(); // object of base class cc

    }
}
