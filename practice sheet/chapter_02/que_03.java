package chapter_02;

import java.util.Scanner;

public class que_03 {
    public static void main(String[] args)
    {
        System.out.println("enter your number");
        Scanner value = new Scanner(System.in);
        int number = value.nextInt();
        System.out.println(number > 10); //directly returns a boolean value
        value.close();
    }
}
