package chapter_07;

public class project_02 {

    //no static to include here
    int result(int x ,int y)
    {
        int z;
        z = x * y / x + y;
        return z;     //return result i.e. stored in z


    }
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int c;
        project_02 object =new  project_02(); //creation of object
        c=object.result(a,b);  //visiting that logic
        System.out.println(c);//printing result


    }
}
