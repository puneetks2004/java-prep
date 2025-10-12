import java.util.Scanner;

public class que_02 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("enter the marks of subject_01");
        float subject_01 = value.nextFloat();
        System.out.println("enter the value of subject_02");
        float subject_02 = value.nextFloat();
        System.out.println("enter the value of subject_03");
        float subject_03 = value.nextFloat();
        float sum = subject_01 + subject_02 + subject_03;
        float cgpa = sum / 30;
        System.out.println("the cgpa is " ); //can also use +cgpa
        System.out.println(cgpa);
        value.close();
    }
}
