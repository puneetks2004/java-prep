//finally keyword --with catch getting executed
package chapter_14;

public class project_13 {
    public static void main(String[] args)
    {
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("code ended");
        }
    }
}
