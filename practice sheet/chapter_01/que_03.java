
import java.util.Scanner;

public class que_03 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("enter your name");
        String str = value.nextLine();
        System.out.println(" hello, " + str + " have a good day ");
        value.close();
    }
}
