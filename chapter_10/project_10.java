package chapter_10;

class andaman {

    public andaman() {
        System.out.println("hello folks");
    }

    public andaman(int x) {
        System.out.println("the value of x is " + x);
    }

}

class daman extends andaman {

    public daman() {
        System.out.println("magic is here");
    }

    public daman(int x,int y) {
        System.out.println("the value of y is " + y);
    }

}

public class project_10 {
    public static void main(String[] args) {
        andaman j = new andaman();
        daman h = new daman();

    }
}
