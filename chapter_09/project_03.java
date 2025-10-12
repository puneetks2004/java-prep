package chapter_09;           //refer next program with constructor 

//custom class
class lee {
    private int id;
    private String city;

    

    public void setcity(String i) {           
        city = i;
    }

    public String getcity() {
        return city;
    }

    public void setid(int x) {               
        id = x;
    }

    public int getid() {
        return id;
    }

}

public class project_03 {
    public static void main(String[] args) {

        lee offend = new lee();

        offend.setcity("delhi");
        offend.setid(20);

        System.out.println(offend.getcity());
        System.out.println(offend.getid());

    }
}
