package chapter_08;

class employee { // no need for object properties creation

    public void ringing() // function of ringing
    {
        System.out.println("i am ringing");
    }

    public void vibrating() // function of vibrating
    {
        System.out.println("i am vibrating");
    }
}

public class que_02 {
    public static void main(String[] args) {
        // instantiation of object
        employee value = new employee();

        value.ringing(); // no need to assign values to variables since we are just printing
        value.vibrating();

    }
}
