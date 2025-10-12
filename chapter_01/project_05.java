package chapter_01;
//to take entire string with gaps and prin it
import java.util.Scanner;  //scanner class

public class project_05 {
    public static void main(String[] args) {
        
        
        Scanner joy = new Scanner(System.in);
        System.out.println("enter any string");
        String str = joy.nextLine(); //nextLine()  will take entire string as entered by user including gaps also
        System.out.println(str);
        joy.close();  //closing object
    }
}
