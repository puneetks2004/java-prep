package chapter_10;

class logic1 {
    int age;

    public logic1() { // constructor is same as the function and gets invoked automatically
        System.out.println("i am champ");
    }

    public void set_age(int i) {
        age = i;
    }

    public int get_age() {
        return age;
    }
}

class logic2 extends logic1 {
    int y;

    public void set_y(int m) {
        y = m;
    }

    public int get_y() {
        return y;
    }
}

public class project_04 {
    public static void main(String[] args) {
        logic1 main = new logic1();
        main.set_age(99);

        System.out.println(main.get_age());

    }
}
