package chapter_09;

class cylinder {
    private int height;
    private int radius;

    public void set_height(int i) { // setting
        height = i;
    }

    public int get_height() {// getting
        return height;
    }

    public void set_radius(int j) {// setting
        radius = j;
    }

    public int get_radius() {// getting
        return radius;
    }

}

public class que_01 {
    public static void main(String[] args) {
        cylinder dimension = new cylinder(); // object with name dimension
        dimension.set_height(10); // passing value of height
        dimension.set_radius(5); // passing value to radius

        System.out.println(" the value of height is "+dimension.get_height()); // getting value of height
        System.out.println(" the value of radius is "+dimension.get_radius()); // getting value of radius

    }
}
