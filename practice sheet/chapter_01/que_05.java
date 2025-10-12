import java.util.Scanner;
public class que_05 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("enter the value");
        boolean val = value.hasNextInt();
        System.out.println(val);//if int than says true else false
        value.close();

    }
}
