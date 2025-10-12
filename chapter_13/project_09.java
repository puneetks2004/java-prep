//Thread.sleep()---method
package chapter_13;

class mig21 extends Thread {

    public void run() {

        while (true) {
            System.out.println("i am coming for you !!");
            // Thread.sleep(4444);//if you write normally than can cause Exception
            // must write in try and catch block since can cause Exceptions
            // Suppose thread T1 is sleeping for 2 seconds, and thread T2 interrupts it
            // before the time is over:
            // Thread.sleep() might throw an exception if another thread interrupts the
            // sleeping thread. If you don't catch it, your program won’t compile.
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

                System.out.println(e);
            }
        }

    }
}

class mig99 extends Thread {

    public void run() {
        while (true) {
            System.out.println("not well !!");
        }
    }
}

public class project_09 {
    public static void main(String[] args) {

        // object creation
        mig21 ob = new mig21();
        mig99 ni = new mig99();

        ob.start();
        ni.start();
        // second thread might get scheduled earlier due to internal CPU scheduling
        // since thread 1 is in sleep .

    }
}
