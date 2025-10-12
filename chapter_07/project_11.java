package chapter_07;

public class project_11 {


    static void change(int [] array) //random name
    {
        array[3] = 900;
    }
    public static void main(String[] args)
    {
        int[] marks = { 45, 23, 89, 78, 66 };
        change(marks);
        // System.out.println(marks[3]);
        int i;
        for(i=0;i<=marks.length;i++)
        {
            System.out.println(marks[i]);
        }
       
    }
}
