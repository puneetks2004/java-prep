//setting priorities in thread
package chapter_13;

class mig extends Thread {
    public mig(String Name) {
        super(Name);

    }

    int i = 5;

    public void run() {
        while (i < 50) {
            System.out.println("we are here " + this.getName());// get name acquired in this class
            i++;
        }
    }
}

public class project_06 {
    public static void main(String[] args)
    {

        mig ob = new mig("puneet");
        mig ob1 = new mig("kunal");
        mig ob2 = new mig("huji");
        mig ob3 = new mig("flourish");
        mig ob4 = new mig("pt");
ob4.setPriority(Thread.MAX_PRIORITY);//setting pt as most priority , will see it most of times
        ob.start();
        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();


    }
}
