package chapter_06;

public class project_02 {
    public static void main(String[] args)
    {//integer array
        int[] marks = { 33, 23, 55, 45, 66 };
        System.out.println(marks.length); //5 number of elements
        System.out.println(marks[0]);
        System.out.println(marks[4]);


        //float array
        float[] value = { 33.4f, 22.4f, 44.3f, 55.5f };
        System.out.println(value[1]);
        System.out.println(value[3]);

        //string array
        String[] name = { "puneet", "kunal", "astha", "shubhangi" };
        System.out.println(name.length);
        System.out.println(name[3]);

        //character array
        char[] values = { 'a', 's', 'f', 'g' };
        System.out.println(values.length);
        System.out.println(values[2]);

        //boolean array
        boolean[] result = { true, false, true, false };
        System.out.println(result[3]);



        }
}
