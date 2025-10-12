package chapter_15;

public class project_16 {
    public static void main(String[] args)
    {
        // int sum = 9;
        // System.out.println(sum);---------------->normal

        // Integer sum = 34;
        // System.out.println(sum);---------------------->wrapper object

        //boxing --------taking primitive value  and storing in wrapper object
        // int sum = 90;
        // Integer val = new Integer(sum);--------->//although works but line means deprecated
        // System.out.println(sum);

        //-----------unboxing taing primitive value out of wrapper object
        // int sum = 90;
        // Integer val = new Integer(sum);
        // int mun = val.intValue();
        // System.out.println(mun);

        // String str = "34";
        // System.out.println(str);

         String str = "34";
         //  System.out.println(str*3); ----------->> //error b/c string and int 
         int num3 = Integer.parseInt(str);// to convert from string to int
         System.out.println(num3*3);//now possible to multiply


    }
           
}
