//thread priorities , by default prints in normal priorities
package chapter_13;

class mega extends Thread {
    public mega(String Name)// constructor
    {
        super(Name);
    }

    public void run() {
        System.out.println("i am the Rock "+this.getName());
    }

}

public class project_05 {
    public static void main(String[] args) {
        // object creation
        mega ob = new mega("Puneet");
        mega ob1 = new mega("kunal");
        mega ob2 = new mega("navneet");
        mega ob3 = new mega("harshit");
        mega ob4 = new mega("sumesh");

        ob.start();
        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();

    }
}