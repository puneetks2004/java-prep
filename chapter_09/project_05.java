package chapter_09; //you can also pass arguments and parameters over here

class legit {

    private int roll_no;
    private String name;

    public legit(int no, String naam) {//constructor with parameters passed here
        roll_no = no;
        name = naam;
    }

    public String value() {
        return name;
    }

    public int amm() {
        return roll_no;
    }

}

public class project_05 {
    public static void main(String[] args) {
        legit vb = new legit(93, "rahul"); // two arguments passed here

        System.out.println(vb.value());
        System.out.println(vb.amm());

    }

}
