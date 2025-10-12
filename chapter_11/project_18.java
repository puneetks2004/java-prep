package chapter_11;//private method in interface declared inside default

interface vel_1 {

    private void spiderman() {// need to completely declare method
        System.out.println("superman is back");
    }

    default void superman() {// default methods can be declared here itself but begining with default keyword
        spiderman();// calling needed since private
        System.out.println("i am superman");
    }
}

interface vel_2 {
    String[] batman();// array of type string

}

class vel_3 {
    public void tony_stark() {
        System.out.println("hello i am tony stark");
    }

}

class vel_4 extends vel_3 implements vel_1, vel_2 {

    public String[] batman() {
        String[] company = { "marvel", "dc", "indian" };
        return company;// company is a arrayof type string
    }

}

public class project_18 {
    public static void main(String[] args) {

        vel_4 generic = new vel_4();
        generic.superman();
        // generic.spiderman();//noneed for it since will automatically get executed
        // with above
        generic.tony_stark();
        String[] values = generic.batman();// functioon returning string array
        for (String elements : values) {
            System.out.print(elements + "\t");
        }

    }
}
