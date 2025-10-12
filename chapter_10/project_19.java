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

public class project_19 {
    public static void main(String[] args) {

        smartphone obj = new smartphone();
        obj.name();//gives exact function present in that class whose object is created
        phone obje = new phone();
        obje.name();//shows exact function of class phone

        
        // smartphone mac = new phone();//runs correctly with no errors
        // phone jog = new smartphone();//shows error

        
    }
}
