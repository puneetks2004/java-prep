
package chapter_11;

class monkey {
    public void jump() {
        System.out.println("jumping");
    }

    public void bite() {
        System.out.println("biting");
    }
}

interface basic_animal {
    void eat();

    void sleep();
}

class human extends monkey implements basic_animal {

    public void eat() {
        System.out.println("eating is good");
    }

    public void sleep() {
        System.out.println("sleeping is good");
    }
}

public class que_03 {
    public static void main(String[] args) {
        human obj = new human();
        obj.eat();
        obj.sleep();
        obj.jump();
        obj.bite();
    }
}
