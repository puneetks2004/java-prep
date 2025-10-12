package chapter_10;

class animal {
    String name;

    public void set_name(String i) {
        name = i;
    }

    public String get_name() {
        return name;
    }

}

class dog extends animal {

    String habit;

    public void set_habit(String i) {
        habit = i;
    }

    public String get_habit() {
        return habit;
    }

}

public class project_03 {
    public static void main(String[] args) {

        animal value = new animal();
        value.set_name("tiger");
        dog val = new dog();
        val.set_name("phucchu"); //use method of animal class
        dog habit = new dog();
        habit.set_habit("bark");

        System.out.println(value.get_name());
        System.out.println(val.get_name());
        System.out.println(habit.get_habit());

    }
}
