package chapter_07;


public class project_06 {

    static int result(int u,int v)  //int shows type of value it will return
    {
        int value;
        value = u + v * 889;
        return (value);
    }
    public static void main(String[] args)
    {
        int a = 22;
        int b = 89;
        int end = result(a, b);//calls function
        System.out.println(end);


        int m = 99;
        int n = 78;
        int ends = result(m, n);// calls function
        System.out.println(ends);
    }
}
