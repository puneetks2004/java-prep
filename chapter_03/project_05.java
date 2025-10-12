package chapter_03;

public class project_05 {
    public static void main(String[] args)
    {
        //substring
        String name = "puneet";
        System.out.println(name);
        System.out.println(name.substring(2));

        System.out.println(name.substring(1, 3));//included index 1,2 only not 3
        String sub = name.substring(2, 5);
        System.out.println(sub);


        //replace

        System.out.println(name.replace('u', 'y'));
        System.out.println(name.replace("neet", "sh"));
        // System.out.println(name.replace('p', "oo")); doesnot work with char and a string

        System.out.println(name.startsWith("pu"));
        System.out.println(name.endsWith("ee"));
        

    }
}
