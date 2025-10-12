package chapter_02;

public class que_02 {
    public static void main(String[] args)
    {
        char grade = 'A';            //encryption
        grade = (char) (grade + 8);      //(char) is used for type casting to give result in char rather in int
        System.out.println(grade);

        grade = (char) (grade - 8);   //decryption
        System.out.println(grade);
    }
}

