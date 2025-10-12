//Exception class in java apart 2
package chapter_14;

public class project_09 {
    public static void main(String[] args) {

        try{
            Exception obj = new Exception("hello i am thy king");
            throw obj;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());//get message from Exception class
            System.out.println("printing printStackTrace");
            e.printStackTrace();

        }
        

    }
}
