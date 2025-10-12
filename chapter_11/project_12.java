package chapter_11;//a class implementing multiple interface

interface kanya {
    void jindal();

}

interface kumari {
    void vedanta();

}

class essar implements kanya, kumari {
    
    public void jindal()
    {
        System.out.println("i am tycoon");
    }

    public void vedanta()
    {
        System.out.println("i am mineral tycoon");
    }
}

public class project_12 {
    public static void main(String[] args) {
        essar obj = new essar();
        obj.jindal();
        obj.vedanta();
    }
}
