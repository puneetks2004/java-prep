package chapter_10; //since parameters are there so prints those with arguments 

class aman {

    public aman() {
        System.out.println("hello folks");
    }

    public aman(int x) {
        System.out.println("the value of x is " + x);
    }

}

class an extends aman {

    public an() {
        System.out.println("magic is here");
    }

    public an(int x, int y) {
        super(x); // sending x to superclass
        System.out.println("the value of y is " + y);
    }

}

public class project_11 {
    public static void main(String[] args) {
        // aman j = new aman();
        an h = new an(6, 5); // passing values through object

    }
}
