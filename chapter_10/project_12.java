package chapter_10;

class dalal {

    public dalal() {
        System.out.println("pokemon");
    }

    public dalal(int x) {
        System.out.println("the value of x is " + x);
    }

}

class kunal extends dalal {

    public kunal() {
        System.out.println("horse");
    }

    public kunal(int x, int y) {
        super(x);
        System.out.println("the value of y is " + y);
    }

}

class beniwal extends kunal {

    public beniwal() {
        System.out.println("gotiya");
    }

    public beniwal(int x, int y, int z) {
        super(x, y);
        System.out.println("the value of z is " + z);
    }

}

public class project_12 {
    public static void main(String[] args) {
        beniwal fog = new beniwal(4, 5, 6);
    }
}
