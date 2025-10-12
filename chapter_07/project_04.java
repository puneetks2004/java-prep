package chapter_07;

import java.util.Scanner;

public class project_04 {

static float result(float x,float y)        //taking realtime input from user
{
    float d = x * y / 8.0f;
    return (d);
}

    public static void main(String[] args)
    {
        Scanner value = new Scanner(System.in);
        System.out.println("enter value of a");
        float a = value.nextFloat();
        float b = value.nextFloat();
        float c = result(a, b);
        System.out.println(c);
        value.close();
    }
}
