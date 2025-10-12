package chapter_09; //constructor overloading

class kk {
    private int marks;
    private String ame;
    private String city;

    public kk(int val, String name) {        //kk constructor with two parameter
        marks = val;
        ame = name;
    }

    public kk(int val, String name, String citye) {       // kk constructor with three parameter
        marks = val;
        ame = name;
        city = citye;

    }

    public kk()                        // kk constructor with 0 parameter
    {
        marks = 99;
        ame = "rawat";
    }

    public int getid() {
        return marks;
    }

    public String getname() {
        return ame;
    }

    public String getcity() {
        return city;
    }
}

public class project_06 {
    public static void main(String[] args) {
        kk arijit = new kk(99, "puneet");// passed arguments
        kk ariji = new kk(939, "saleem", "delhi");// passed arguments in new object
        kk kunal = new kk();
        System.out.println(arijit.getid());
        System.out.println(arijit.getname());
        System.out.println(ariji.getcity());
        System.out.println(ariji.getid());
        System.out.println(ariji.getname());
        System.out.println(kunal.getid());
        System.out.println(kunal.getname());

    }
}
