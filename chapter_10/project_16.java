package chapter_10; //super keyword


class my {
    int age;

    public my(int age) {
        this.age = age;
        this.age = age;
        System.out.println(this.age);
    }
}

class there extends my {

    int value;

    public there(int value) {
        super(3);
        this.value = value;
        System.out.println(this.value);
    }
}

public class project_16 {
    public static void main(String[] args) {
        my goat = new my(88);
        there ff = new there(33);
    }
}
