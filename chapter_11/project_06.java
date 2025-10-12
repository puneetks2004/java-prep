package chapter_11;//if not defining all abstract methods than that class also treated as abstract class 

abstract class bang {
    public abstract void mind();
    public abstract void deal();
}

abstract class drag extends bang { // not definig all abstract methods of parent class
    public void mind() { // so eventually turned out to itself abstract class
        System.out.println("mind it");
    }
}

class meta extends drag { // another child class inheriting above drag class to define the abstract method
                          // that was left indefined

    public void deal() {
        System.out.println("deal is done");
    }
}

public class project_06 {
    public static void main(String[] args) {
        meta jo = new meta();         //final object of grandchild class 
        jo.mind();
        jo.deal();
    }
}
