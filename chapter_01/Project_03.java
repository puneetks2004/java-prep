package chapter_01;
import java.util.Scanner;//import scanner class to enable taking input from user 
public class Project_03{        //class great
    
public static void main(String[] args){   //main function
    System.out.println("this program takes input and gives sum of numbers");
    Scanner addition = new Scanner(System.in);  //addition object of class great
    System.out.println("enter the value of a ");
    int a = addition.nextInt(); // input is stored in  variable a using function nextInt();
    System.out.println("enter the value of b");
    int b = addition.nextInt(); //input is stored in variable b using a function nextint();
    int sum = a + b;         //sum variable to store values 
    System.out.println("sum  of  a and b is ");
    System.out.println(sum);  //to print value of a
    addition.close();      // must close object at end to  avoid warnigs
}
}
