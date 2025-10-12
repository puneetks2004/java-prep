package chapter_03;
                                            //name.length()  ------method
import java.util.Scanner;

public class project_03 {
    public static void main(String [] args)
    {
        String name = "puneet";
        System.out.println(name);
        int count = name.length();
        System.out.println(count);

        //to get value from user
        Scanner value = new Scanner(System.in);
        System.out.println("enter the string name");
        String designation = value.next();
        int number = designation.length();
        System.out.println(number);
        value.close();


    }
}
