//implementation of concurrency using extending thread class 

package chapter_13;

//Thread is a built-in class in Java. no need to write explicitly
class mig1 extends Thread {

    public void run()
    {
        while (true) {
            System.out.println("eat pizza");
        }
    }
}

class mig2 extends Thread {
    public void run()
    {
        while (true) {
            System.out.println("eat chocolate");
        }
    }
    
}

public class project_02 {
    public static void main(String[] args)
    {
        mig1 obj1=new mig1();
        mig2 obj2 = new mig2();

        obj1.start();
        obj2.start();
        //should be obj1.run()----->but start method internally runs 'run' function
        //clearly you can see concurrent running of message both function got few time alterntly to get displayed 
        // The Java scheduler decides which thread gets CPU time,
        //it is also a builtin function

    }
}
