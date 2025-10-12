///existence of normal concurrency without thread method

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

public class project_07 {
    public static void main(String[] args) {
        air ob = new air();
        water nm = new water();

        nm.start();
      
        ob.start();
        
    }
   

}



