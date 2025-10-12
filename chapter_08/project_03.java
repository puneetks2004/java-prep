package chapter_08;

class details {
    int id;
    String city;
    int enrollment;       //custom class

    public void print()   //function
    {
        System.out.println(city);
        System.out.println(id);
        System.out.println(enrollment);
    }

}

public class project_03 {
    public static void main(String[] args)
    {
        System.out.println("creating custom class and calling attributes by function");
        details name = new details(); //instantiation of object named as name
        name.id = 12;
        name.city = "gujrat"; //attributes setting
        name.enrollment = 112;

        name.print();

        
    }
}
