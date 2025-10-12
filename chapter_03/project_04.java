package chapter_03;

public class project_04 {
    public static void main(String[] args)
    {
        String name = "ShiVa";
        int count = name.length();
        System.out.println(count);
        String value = name.toLowerCase();
        System.out.println(value);
        String new_value = name.toUpperCase();
        System.out.println(new_value);

        String student_name = "        rahul gandhi   "; 
        System.out.println(student_name); //will have spaces in starting as well as in trailing
        String trimmed = student_name.trim();
        System.out.println(trimmed);
        //can also be written as
        System.out.println(trimmed.trim());

    }
}
