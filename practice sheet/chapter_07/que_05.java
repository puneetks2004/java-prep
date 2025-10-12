package chapter_07;

public class que_05 {
    static float sum(int ...arr)
    {
        float sum = 0;
        for(float a : arr)
        {
            sum = sum + a;
        }
        float result;
        result = sum / arr.length;
        return (result);
    }
    public static void main(String[] args)
    {
        System.out.println(sum(444, 565));
        System.out.println(sum(444, 565,7744));
    }
}
