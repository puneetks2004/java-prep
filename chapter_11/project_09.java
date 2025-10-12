package chapter_11;//can create properties in interface

interface regular {

    int gear = 100;//property of interface
    String monetary = "gulaty";//property of interface

    void thor();

}

class glass implements regular {
    
    public void thor()//defining method
    {
        System.out.println("i am king of assguard");
    }
}

public class project_09 {
    public static void main(String[] args) {
        glass obj = new glass();//object
        obj.thor();//to print method
        System.out.println(obj.gear);//to print properties
        System.out.println(obj.monetary);//to print properties
    }
}//you cannot modify properties they are final
