package chapter_09;

class lavish {
    private int length;
    private int breadth;

    public lavish() // constructor 1
    {
        length = 833;
        breadth = 34;
    }

    public lavish(int i, int j) { // constructor 2
        length = i;
        breadth = j;
    }

    public int length_() {
        return length;
    }

    public int breadth_() {
        return breadth;
    }
}

public class que_04 {
    public static void main(String[] args) {
        lavish rectangle = new lavish();// object 1
        lavish rectanl = new lavish(99, 44);// object 2

        System.out.println(rectangle.length_());
        System.out.println(rectanl.breadth_());

    }
}
