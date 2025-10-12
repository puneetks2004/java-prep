package chapter_08;

class loyee {
    int salary;
    String name;
    

    public int getsalary() // method returning salary
    {
        return salary;
    }

    public String getname() {   //method returning name
        return name;
    }
}

public class que_01 {
    public static void main(String[] args) {
        // instantiation of object
        loyee dimensity = new loyee();
        dimensity.salary = 900000;
        dimensity.name = "puneet";

        System.out.println(dimensity.getsalary());
        System.out.println(dimensity.getname());

    }
}
