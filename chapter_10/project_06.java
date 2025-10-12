package chapter_10;

class classA {

    public classA() { // parent class constructor

        System.out.println("life's good");
    }
}

class classB extends classA {

    public classB() { // it's own constructor
        System.out.println("minute damage");

    }
}

public class project_06 {
    public static void main(String[] args) {
        classA land = new classA(); // object of classA
        classB kl = new classB(); // object of classB

    }
}
