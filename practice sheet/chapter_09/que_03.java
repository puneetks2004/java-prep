package chapter_09;

class cylinder_02 {
    private int height;
    private int radius;

    public cylinder_02(int i, int j) {
        height = i;
        radius = j;

    }

    public int height_() {
        return height;

    }

    public int radius_() {
        return radius;
    }
}

public class que_03 {
    public static void main(String[] args) {
        cylinder_02 dime = new cylinder_02(20, 10);
        System.out.println("The height is " + dime.height_());
        System.out.println("The radius is " + dime.radius_());

    }
}
