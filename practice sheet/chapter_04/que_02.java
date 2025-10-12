package chapter_04;

import java.util.Scanner;
                                 //since input marks are float so they are bydefault stored as float value if would have been int yhan would be compulsary to write .0f because operation between int gives int as final value , even if here you write as .0f although float then no issues 
public class que_02 {
    public static void main(String[] args)
    {
        Scanner value = new Scanner(System.in);
        System.out.println("enter your marks in maths");
        float num_1 = value.nextFloat();
        System.out.println("enter your marks in science");
        float num_2 = value.nextFloat();
        System.out.println("enter your marks in IT");
        float num_3 = value.nextFloat();
        float percent_maths = (num_1 / 80) * 100;
        float percent_science = (num_2 / 80) * 100;
        float percent_IT = (num_3 / 80) * 100;
        float overall = (num_1 + num_2 + num_3) / 240 * 100;

        System.out.println("your overall percentage is " + overall);
        System.out.println("your percentage in maths is " + percent_maths);
        System.out.println("your percentage in science is " + percent_science);
        System.out.println("your percentage in IT is " + percent_IT);
        System.out.println("num_1 is " + num_1);

        if (overall > 40 && percent_maths > 33 && percent_science > 33 && percent_IT > 33)
        {
            System.out.println("congratulations! you are pass");

        }
        else {
            System.out.println("sorry, you are fail");
        }




        value.close();
    }
}
