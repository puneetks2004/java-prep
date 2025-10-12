package chapter_01;
import java.util.Scanner; //scanner class imported

public class project_04 {       // class name
  
    
    public static void main(String[] args) //prog. execution starts from main function
        {
            System.out.println("This program gives difference of float numbers");
            Scanner diff = new Scanner(System.in);//object diff creation
            System.out.println("enter the value of a");
            float a = diff.nextFloat();  //takes float value in a
            System.out.println("enter the value of b");
            float b = diff.nextFloat(); //takes float value in b
            float result = a - b;
            System.out.println(result);  //displaying result
            diff.close(); //closing object created to avoid warnings 
        }
    
}
