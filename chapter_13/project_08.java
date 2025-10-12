//.join() -to allow one method complete than allow other method to execute
package chapter_13;

class air extends Thread {

    public void run() {

        while (true) {
            System.out.println("i am great");

        }
    }
}

class water extends Thread {

    public void run() {

        while (true) {
            System.out.println("get it done");

        }
    }

}

public class project_08 {
    public static void main(String[] args) {
        air ob = new air();
        water nm = new water();

        nm.start();
        try {
            nm.join();//to allow it execute first
        } catch (Exception e) {
            System.out.println(e);
        }
        ob.start();
        
    }
   

}

// is called first, and then nm.join() ensures that the ob thread does not start
// until nm has finished.
// normally with ob nm also starts what if i want ob to finish first than nm

//try {
    // Code that might cause an exception
//} catch (ExceptionType e) {
    // Code to handle the exception
//}
