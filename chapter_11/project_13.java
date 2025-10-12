package chapter_11;//why multiple inheritance is not allowed "diamond problem"

class class_A {

    void general() {
        System.out.println("indian army");
    }

}

class class_B {

    void general() {
        System.out.println("indian airforce");
    }
}

class class_C extends class_B, class_A{

}

public class project_13 {
    public static void main(String[] args) {
        class_C obj=new class_C();
obj.general();
obj.general();

    }

}
