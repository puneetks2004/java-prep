package chapter_01;

//prog. to print only single string word
import java.util.Scanner;  // scanner class imported

public class project_06 {  // class
    public static void main(String[] args)  //main function
    {
        Scanner hi = new Scanner(System.in); //object creation to read from user
        System.out.println("enter any string");
        String str = hi.next();  //storing value in string
        System.out.println(str);
        hi.close(); //closing object to avoid warnings
}
    
}