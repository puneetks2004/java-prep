package chapter_01;
import java.util.Scanner; //import scanner class

public class project_07 {  //creation of class
    public static void main(String[] args) {  //creation of main function
        Scanner val = new Scanner(System.in);  //creation of object
        System.out.println("enter the number");
        boolean value = val.hasNextInt();  //hasNextInt() is a method to check  validity of integer
        System.out.println(value);  //prints value of value in true or false base dupon int 
        val.close();
    }
}
