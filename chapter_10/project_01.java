package chapter_10;

class base {
    int x;

    public void set_x(int j) {
        x = j;
    }

    public int get_x() {
        return x;
    }
}

class derived extends base {

    int y;

    public void set_y(int m) {
        y = m;
    }

    public int get_y() {
        return y;
    }
}

public class project_01 {
    public static void main(String[] args) {
        base kk = new base();
        kk.set_x(99);
        derived kk_ = new derived(); // you can create many number of objects of same class
        kk_.set_x(345);
        derived KBC = new derived(); // you cannot create duplicate objects in a same file
        KBC.set_y(8832);

        System.out.println(kk.get_x());
        System.out.println(kk_.get_x());
        System.out.println(KBC.get_y());
    }
}
