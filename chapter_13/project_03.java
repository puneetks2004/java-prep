//implementing concurrency using implementing runnable interface

package chapter_13;

class temp1 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("creating dummy");
        }
    }
}

class temp2 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("i am great");
        }
    }
}

public class project_03 {
    public static void main(String[] args) {

        // object creation
        temp1 ob = new temp1();
        Thread grid = new Thread(ob);
        temp2 obb = new temp2();
        Thread flex = new Thread(obb);

        grid.start();
        flex.start();

        // calling methods-----this way wont work
        // ob.run();
        // obb.run();

        // vvi
        // Yes, when implementing the Runnable interface, it is compulsory to define the
        // run() method

    }
}
