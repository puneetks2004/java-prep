package chapter_12;//checking access modifiers visiblity within same class

class rock {
    protected int x = 3;
    public int y = 334;
    private int z = 23;
    int h = 99;// default

    public void a1() {
        System.out.println(x);
    }

    public void a2() {
        System.out.println(y);
    }

    public void a3() {
        System.out.println(z);
    }

    public void a4() {
        System.out.println(h);
    }
}

public class project_01 {
    public static void main(String[] args) {
        rock obj = new rock();
        obj.a1();// check for x
        obj.a2();// check for y
        obj.a3();// check for z
        obj.a4();// check for h

    }
}
