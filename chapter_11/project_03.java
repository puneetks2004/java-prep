package chapter_11;  //combination of abstract and non-abstract methods

abstract class sale { // abstract class as a reference that can be implemented by child class
    public abstract void fail();

    public void fuck() {
        System.out.println("fuck your ass");
    }
}

class heavy extends sale {

    public void fail() {
        System.out.println("i am a failure");
    }
}

public class project_03 {
    public static void main(String[] args) {
        heavy obj = new heavy();
        obj.fail();
        obj.fuck();
    }
}
