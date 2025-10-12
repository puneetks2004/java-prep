//getting access to several other methods like getItems, getNames, etc of a Thread class.
package chapter_13;

class rule1 extends Thread {
    rule1(String fish)// constructor
    {
        super(fish);// sending name value to parent thread class via constructor
    }

    public void run() {// function
        int i = 2;
        while (i < 5) {
            System.out.println("I");
            i++;
        }
    }

}

public class project_04 {
    public static void main(String[] args) {

        rule1 ob = new rule1("puneet");
        ob.start();
        // start() internally calls run() and runs it in a new thread.
        // run() directly won't start a new thread—it will execute sequentially like a
        // normal method.

        // many other methods are also there that can be invoked ,that are offered by
        // thread class
        System.out.println("my id is " + ob.getName());// Returns the name of the thread.
        System.out.println("my id is " + ob.getClass());// Returns the runtime class of the object.

    }
}