import java.util.Scanner;

public class que_04 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("enter value on kilometer(kms)");
        double kms = value.nextDouble();
        double result = kms * 0.6213;
        System.out.println(+ kms + " km is equal to " + result + " miles ");

        value.close();
    }
}
