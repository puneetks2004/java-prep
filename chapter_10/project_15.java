package chapter_10;//with this keyword

class eke {
    int age;

    public eke(int age)// constructor is a type of setter only
    {
        this.age = age;// assign value to instance variable
    }

    public int get_age() // getter
    {
        return age;
    }

}

public class project_15 {
    public static void main(String[] args) {
        eke e = new eke(33);// object of class ek

        System.out.println(e.get_age());
    }
}
