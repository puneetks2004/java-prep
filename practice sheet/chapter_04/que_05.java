package chapter_04;

import java.util.Scanner;

public class que_05 {
    public static void main(String[] args)
    {
        Scanner value = new Scanner(System.in);
        System.out.println("enter url");
        String url = value.nextLine();
        if (url.endsWith("com"))
        {
            System.out.println("it is a commercial website");
        }
        else if (url.endsWith("org"))
        {
            System.out.println("it is a organizatinal website");
        }
        else if(url.endsWith("in"))
        {
            System.out.println("it is an indian website");

        }
    
        value.close();
    }
}
