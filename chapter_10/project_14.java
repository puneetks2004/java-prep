package chapter_10;//without this keyword

class ek {
    int age;

    public ek(int age)// constructor is a type of setter only
    {
        age = age;
    }

    public int get_age() // getter
    {
        return age;
    }

}

public class project_14 {
    public static void main(String[] args) {
        ek e = new ek(33);// object of class ek

        System.out.println(e.get_age());
    }
}
