//program to find percentage of marks

import java.util.Scanner;  //import scanner class

public class practice_01 {  //class
    public static void main(String[] args) //function
    {
        Scanner value = new Scanner(System.in); // creation of object
        System.out.println("......PROGRAM TO CALCULATE PERCENTAGE OF  STUDENT IIN EXAM....");
        System.out.println("enter the value of subject_01 ");
        float subject_01 = value.nextFloat(); //inut marks_01
        System.out.println("enter the value of subject_02");
        float subject_02 = value.nextFloat();  //input marks_02
        System.out.println("enter the value of subject_03");
        float subject_03 = value.nextFloat();  //input marks_03
        System.out.println("enter the value of subject_03");
        float subject_04 = value.nextFloat();   //input marks_04
        System.out.println("enter the value of subject_05");
        float subject_05 = value.nextFloat();   //input marks_05
        float sum = subject_01 + subject_02 + subject_03 + subject_04 + subject_05; //sum
        float result = sum / 5;    //percentage
        System.out.println("the percentage according to marks  entered is ");
        System.out.println(result);
        value.close(); //close object to avoid warnings


    }
} 