package chapter_11;//abstract class

abstract class dead {

    public abstract void getup();//just declaring it here not defining

    public void sun()
    {
        System.out.println("sun is shining");
    }

}

class alive {
    
}

public class project_02 {
    public static void main(String[] args) {
        dead obj = new dead(); // you cannot create object of abstract class
        obj.sun();

    }
   
}
