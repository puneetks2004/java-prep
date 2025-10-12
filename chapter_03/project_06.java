package chapter_03;

public class project_06 {
    public static void main(String[] args)
    {
        String name = "puneet";
        //name.charAt();
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(2));

        //name.indexOf();
        System.out.println(name.indexOf("ee"));//gives index of stating character
        System.out.println(name.indexOf("t"));

        //name.indesxOf("s",3);
        System.out.println(name.indexOf("pu", 4));
        System.out.println(name.indexOf("et", 2));
        
        //name.lastindexof("e",1);
        String nme = "rajjeeev";
        System.out.println(nme.lastIndexOf("e", 3));
        System.out.println(nme.lastIndexOf("j", 1));

        //name.lastIndexof("e");
        System.out.println(name.lastIndexOf("e"));//returns 4 as index of e last is 4

        //name.equals("string");
        System.out.println(name.equals("puneet")); //true if name==puneet
        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("PUneeT"));//TRUE BECAUSE CHARACTERS ARE SAME
        System.out.println("puneet is the god eho can do \n anything");
    }
}
