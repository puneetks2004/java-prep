package chapter_11;//multiple interface


interface val_1 {//interface 1
    void must();

    void hug();
}

interface val_2 {//interface 2

    void guts();

    void frustated();

}

class doing implements val_1, val_2 {//class implementing both above interfaces

    public void must()
    {
        System.out.println("do it must");
    }
    
    public void hug() {
        System.out.println("do it happily");
    }
    
    public void guts() {
        System.out.println("do it anyway");
    }
    
    public void frustated() {
        System.out.println("do it now");
    }

}

public class project_10 {
 public static void main(String[] args) {
     doing hot = new doing();//object
     hot.hug();//calling all objects
     hot.guts();
     hot.must();
     hot.frustated();

 }   
}
