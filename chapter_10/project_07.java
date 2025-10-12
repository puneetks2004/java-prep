package chapter_10; //constructor overloading within class

class klp {

    public klp() {
        System.out.println("not a dude");
    }

    public klp(int a) {
        System.out.println("the value of a is" + a);
    }
}

class mlp extends klp {        //by default runs that constructor with no parameter

}

public class project_07 {
    public static void main(String[] arrgs) {
        // klp value_1 = new klp();
        mlp val = new mlp();
    }
}
