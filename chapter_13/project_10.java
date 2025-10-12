//getState() method to get current state of thread

package chapter_13;

class local extends Thread {
    public void run() {
        System.out.println("get the job done right way");
    }
}

class magical extends Thread {
    public void run() {
        System.out.println("bang on");
    }
}

public class project_10 {
    public static void main(String[] args) {

        local go = new local();// object of class local that has not been started
        System.out.println("The current state is " + go.getState());

        magical ho = new magical();// object of class magical that has been started
        ho.start();
        System.out.println("The state of this is " + ho.getState());
    }
}
