package chapter_09;

class cylinder_01 {
    private int height;
    private int radius;

    public void set_height(int i) {
        height = i;
    }

    public int get_height() {
        return height;
    }

    public void set_radius(int j) {
        radius = j;
    }

    public int get_radius() {
        return radius;
    }

    public double get_surface_area() {
        return (2 * 3.14 * radius * radius) + (2 * 3.14 * radius * height);
    }

    public double get_volume() {
        return (3.14 * radius * radius * height);
    }

}

public class que_02 {
    public static void main(String[] args) {
        cylinder_01 dimension = new cylinder_01();// object

        dimension.set_height(12);
        dimension.set_radius(9);

        System.out.println("total surface area of cylinder is " + dimension.get_surface_area()); // for area
        System.out.println("total volume of cylinder is " + dimension.get_volume()); // for volume

    }
}
