package chapter_11;

abstract class pen_01 {
    public abstract void write();

    public abstract void refil();
}

class fountain_pen extends pen_01 {

    public void write() {
        System.out.println("writes");
    }

    public void refil() {
        System.out.println("refils");
    }

    public void change_nib() {
        System.out.println("will change soon");
    }
}

public class que_02 {
    public static void main(String[] args) {
        fountain_pen obj = new fountain_pen();
        obj.refil();
        obj.change_nib();
        obj.write();
    }
}
