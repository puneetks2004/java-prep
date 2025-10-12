package chapter_07;

public class project_03 {

    static int sum(int x,int y)  //sum method
    {
        int result;
        result = x + y;
        return (result);
    }

    public static void main(String[] args)
    {
        int p = 20;
        int q = 10;
        int c = sum(p, q);   //call method written  above
        System.out.println(c); //prints value
        


        //calling agin
        int place_a=9990;
        int place_b = 889;
        int end = sum(place_a, place_b);
        System.out.println(end);



        
    }
}
