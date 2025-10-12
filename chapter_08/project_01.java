package chapter_08;


//this is our custom class named as employee
class emp{ // emp class
    int id;
    String name;
}

public class project_01 {
    public static void main(String[] args) {
        emp harry = new emp(); // creation/instantiation of object of employee class named as harry


        harry.id = 12; // setting properties/attributes
        harry.name = "code_with_harry";


        System.out.println(harry.id);
        System.out.println(harry.name); // printing properties/attributes

    }
}
