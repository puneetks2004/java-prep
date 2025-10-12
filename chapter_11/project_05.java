package chapter_11;//abstract class having only non-abstract methods

abstract class gut {  //since abstract so cannot create its object

    public void jockey()
    {
        System.out.println("i am jocky");
    }

    public void luxcozi()
    {
        System.out.println("i am lux cozi");
    }
}

class mut extends gut{
    
}

public class project_05 {
    public static void main(String[] args)
    {
        mut obj = new mut();
        obj.luxcozi();
        obj.jockey();
    }
}
