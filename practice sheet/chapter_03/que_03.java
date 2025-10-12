package chapter_03;
import java.util.Scanner;

public class que_03 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("enter your name");
        String name = value.nextLine();
        String nal = "DEAR NAME , THANKS A LOT";
        System.out.println(nal.replace("NAME",name));
        value.close();
    }
}
