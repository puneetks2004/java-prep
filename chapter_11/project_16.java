package chapter_11;

interface level1 {

    void spiderman();

    void superman();
}

interface level2 {
    String[] batman();// array of type string

    void aquaman();

}

class level3 {
    public void tony_stark() {
        System.out.println("hello i am tony stark");
    }

}

class level4 extends level3 implements level1, level2 {

    public String[] batman() {
        String[] company = { "marvel", "dc", "indian" };
        return company;// company is a arrayof type string
    }

    public void aquaman() {
        System.out.println("hello i am aquaman");
    }

    public void spiderman() {
        System.out.println("i am spiderman");
    }

    public void superman() {
        System.out.println("i am superman");
    }
}

public class project_16 {
    public static void main(String[] args) {

        level4 generic = new level4();
        generic.superman();
        generic.spiderman();
        generic.aquaman();
        generic.tony_stark();
        String[] values = generic.batman();// functioon returning string array
        for (String elements : values) {
            System.out.print(elements + "\t");
        }

    }
}
