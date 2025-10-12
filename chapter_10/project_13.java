package chapter_10;

class dal {

    public dal() {
        System.out.println("pokemon");
    }

    public dal(String x) {
        System.out.println("the value of x is " + x);
    }

}

class nal extends dal {

    public nal() {
        System.out.println("horse");
    }

    public nal(String x, String y) {
        super(x);
        System.out.println("the value of y is " + y);
    }

}

class beni extends nal {

    public beni() {
        System.out.println("gotiya");
    }

    public beni(String x, String y, String z) {
        super(x, y);
        System.out.println("the value of z is " + z);
    }

}

public class project_13 {
    public static void main(String[] args) {
        beni fog = new beni("sultan", "rai", "jannat");
    }
}
