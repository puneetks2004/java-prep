package chapter_08;

class value { // custom class
    int id;
    String name;
    String city;
    int salary;

    public void id_() {
        System.out.println(id);
    }

    public void name_() {
        System.out.println(name);
    }

    public void city_() {
        System.out.println(city);
    }

    public int salary_() {
        return salary;
    }
}

public class project_04 {
    public static void main(String[] args) {
        value off = new value();// creation/instantiation of object
        off.id = 010;
        off.name = "mrintunjay"; // attributes setting
        off.city = "rajkot";
        off.salary = 500000;

        // one way
        System.out.println(off.id);
        System.out.println(off.name);
        System.out.println(off.city);

        // secomd way
        off.id_();
        off.name_(); // using function call
        off.city_();

        // third way
        int detail = off.salary_();
        System.out.println(detail);

    }
}
