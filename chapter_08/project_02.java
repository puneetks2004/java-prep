
package chapter_08;

class Employee {
    int id;
    String name;

    public void printDetails() {
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
    }

    public class project_02 { // Changed class name to follow Java conventions

    }

    public static void main(String[] args) {
        Employee neet = new Employee(); // instantiating a new object named as neet
        neet.id = 15;
        neet.name = "puneet"; // setting properties

        neet.printDetails();
    }
}
