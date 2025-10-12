package chapter_09;

class dashing {
    private int id;
    private String city;

    public dashing() {
        id = 978;
        city = "ahemedabad";
    }

    public int getid() {
        return id;
    }

    public String g_city() {
        return city;
    }

}

public class project_04 {
    public static void main(String[] args) {
        dashing value = new dashing();

        System.out.println(value.getid());
        System.out.println(value.g_city());

    }
}
