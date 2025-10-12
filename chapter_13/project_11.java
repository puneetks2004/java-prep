//setting priorities in thread
package chapter_13;

class mlig extends Thread {
    public mlig(String Name) {
        super(Name);

    }


    public void run() {
        while (true) {
            System.out.println("we are here " + this.getName());// get name acquired in this class
            
        }
    }
}

public class project_11 {
    public static void main(String[] args) {

        mlig ob = new mlig("puneet");
        mlig ob1 = new mlig("kunal");
        mlig ob2 = new mlig("huji");
        mlig ob3 = new mlig("flourish");
        mlig ob4 = new mlig("pt");
        ob4.setPriority(Thread.MAX_PRIORITY);// setting pt as most priority , will see it most of times
        ob.start();
        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();

    }
}
