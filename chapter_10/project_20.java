
package chapter_10;

class smartphone {

    public void name() {
        System.out.println("i am java in class smartphone");
    }

    public void greet() {
        System.out.println("get it done");
    }
}

class phone extends smartphone {

    public void name() {
        System.out.println("i am java in class phone");
    }

    public void rock() {
        System.out.println("looks good");
    }
}

public class project_20 {
    public static void main(String[] args) {
        smartphone obj = new phone();
        obj.name();// in common function runs for function of child not parent rest all runs for
                   // parent only
        obj.greet();
    }
}
