package chapter_03;

public class que_04 {
    public static void main(String[] args)
    {
        String name = "pun   eet";
        System.out.println(name);
        System.out.println(name.indexOf(" "));//for single space
        System.out.println(name.indexOf("  ")); //for double space
        System.out.println(name.indexOf("   "));//for triple space
        System.out.println(name.indexOf(  "      "));//for 4 space not exist so -1
        
        

    }
}
