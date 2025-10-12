package chapter_11;//normal function

class car {

    public void drive() {
        System.out.println("drive slowly");
    }

    public void play() {
        System.out.println("play music");
    }
}

public class project_01 {
    public static void main(String[] args) {

        car obj = new car();// object of a car class
        obj.drive();
        obj.play();
    }
}
