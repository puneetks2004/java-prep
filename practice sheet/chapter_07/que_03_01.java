package chapter_07;

public class que_03_01 {

    static int sum(int x) {

        if (x == 1) {
            return (1);

        } else {
            return x + sum(x - 1);

        }
    }

    public static void main(String[] args) {
        System.out.println("the result is " + sum(10)); // function call
    }
}
