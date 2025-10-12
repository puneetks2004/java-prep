package chapter_09;

class lorence {
    private int id;
    private String name; // getter and setter


    public lorence(){                     //constructor
        id = 979;
        name = "raghav";
    }

    // public void name_(String i) {        //setter

    //     name = i;

    // }

    public String getname_() {
        return name;
    }

    // public void id_(int j) {    //setter
    //     id = j;
    // }

    public int getid_() {
        return id;
    }

}

public class project_07 {
    public static void main(String[] args) {
        lorence bishnoi = new lorence();
        // bishnoi.id = 99;
        // bishnoi.name = "khalil"; //will no more work since private attributes so
        // can't see

        // bishnoi.id_(99);              //for getter and setter
        // bishnoi.name_("khalil");

        System.out.println(bishnoi.getid_());
        System.out.println(bishnoi.getname_());

    }
}
