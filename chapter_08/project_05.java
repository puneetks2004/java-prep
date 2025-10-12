package chapter_08; //calculating area and perimeter of circle

class circle { // own custom class

    int radius; // attribute of class is radius

    public float calculate_area() {         //function for area
        return 3.14f * radius * radius;
    }

    public float calculate_perimeter() {     //function for perimeter
        return 2 * 3.14f * radius;
    }
}

public class project_05 {
    public static void main(String[] args) {
        circle value = new circle(); // creation of object named as value

        value.radius = 8; // value alloted as 8

        System.out.println(value.calculate_area());
        System.out.println(value.calculate_perimeter());

    }
}
