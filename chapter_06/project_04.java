package chapter_06;

public class project_04 {
    public static void main(String[] args)
    {                    //printing in reverse order
        int i;
        int[] marks = { 34, 575, 864, 322, 5452, 23 };
        for(i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }

        System.out.println("below is for each loop");

        for(int elements:marks)
        {
            System.out.println(elements);
        }
    }
}
