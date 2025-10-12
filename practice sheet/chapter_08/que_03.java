package chapter_08;

class square {
    int side;

    public int area() {
        return side * side;

    }

    public int perimeter() {
        return 4 * side;
    }
}

public class que_03 {
    public static void main(String[] args) {
        square calculate = new square();
        calculate.side = 5;

        System.out.println("the area is " + calculate.area());
        System.out.println("the perimeter is " + calculate.perimeter());
    }
}
