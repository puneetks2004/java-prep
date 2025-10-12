package chapter_11;//interfaces


interface car_heavy {//interface with only methods

    void bmw(); //abstract method 1

    void maserrati();//abstractv method 2
}

class specefic implements car_heavy {  //class implementing all abstract  methods of interface
    
    public void bmw() //must involve public as access modifier
    {
        System.out.println("great car with personalized frestures");
    }

    public void maserrati()//must involve public as access modifier
    {
        System.out.println("classic car with classic beauty");
    }
}

public class project_07 {
    public static void main(String[] args)
    {

        specefic obj = new specefic();//creatnig object
        obj.bmw(); //calling functions
        obj.maserrati(); //calling functions
    }
}
