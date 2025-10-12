package chapter_08;

class create {
    int length;
    int breadth;

    public int calculate_area() {
        return length * breadth;

    }

    public int calculate_perimeter() {
        return 2 * (length + breadth);

    }

}

public class project_06 {
    public static void main(String[] args) {
        create value = new create();
        value.length = 10;
        value.breadth = 5;

        System.out.println(value.calculate_area());
        System.out.println(value.calculate_perimeter());
    }
}
