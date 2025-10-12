//finally keyword --with try getting executed
package chapter_14;

public class project_14 {
    public static void main(String[] args) {

        try{
            int a=99;
            int b=4;
            int c=a/b;
            System.out.println(c);
            return;
        }
        catch(Exception e)
        {
            System.out.println("issue is :" + e);
        }
        finally {
            System.out.println("finally done");
        }

        

    }
}
