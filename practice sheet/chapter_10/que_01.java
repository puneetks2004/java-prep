package chapter_10;

class lock_circle {
    int radius;

    public lock_circle()// constructor initializing value of radius
    {
        radius = 10;
    }

    public double area_circle()// function to calculate area of circle
    {
        return 3.14 * radius * radius;
    }

}

class lock_cylinder extends lock_circle {

    int height;

    public lock_cylinder()// constructor initializing value of height
    {
        height = 20;

    }

    public double area_cylinder()// function to calculate area of cylinder
    { // inheriting radius from parent
        return (2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius);
    }

}

public class que_01 {
    public static void main(String[] args) {
        lock_circle flawless = new lock_circle();// object of class circle
        lock_cylinder seamless = new lock_cylinder();// object of class cylinder
        System.out.println(flawless.area_circle());
        System.out.println(seamless.area_cylinder());

    }
}
