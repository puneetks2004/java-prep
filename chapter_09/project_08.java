package chapter_09; //constructor overloading

class sand {
    private int id; // attributes declared
    private String name;
    private String city;

    public sand() {
        id = 44;
        city = "kerala";
        name = "puneet";
    }

    public sand(int i, String j) {
        id = i;
        name = j;
    }

    public sand(int i, String j, String m) {
        id = i;
        name = j;
        city = m;
    }

    public int id_() {
        return id;
    }

    public String name_() {
        return name;
    }

    public String city_() {
        return city;
    }
}

public class project_08 {
    public static void main(String[] args) {
        sand level = new sand(); // 0 arguments passed
        sand lel = new sand(99, "anna"); // two arguments passed
        sand le = new sand(88, "ronit", "denmark"); // three arguments passed

        System.out.println(level.city_());
        System.out.println(le.city_());
        System.out.println(lel.name_());
        System.out.println(lel.city_());

    }
}
