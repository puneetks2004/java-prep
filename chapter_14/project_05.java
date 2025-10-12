//Exception handling techniqes
package chapter_14;

public class project_05 {
    public static void main (String[] args)
    {
        int a = 67;
        int b = 0;


        try{//try to run this statement
            System.out.println("the result is : "+a/b);
        }//if exception occurred than will be handeled by below catch
        catch(Exception e)//e is just a variable name
        {
            System.out.println(e);
        }

    }
}