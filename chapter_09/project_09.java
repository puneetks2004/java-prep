package chapter_09;

class ko {
    private int id;
    private String city;

    public ko(int x, String j) // constructor
    {
        id = x;
        city = j;
        city = "moradabad";  //re updation of value 
    }

    public int give_id() {
        return id;
    }

    public String give_city() {
        return city;
    }
}

public class project_09 {
    public static void main(String[] args) {
        ko zack = new ko(97, "hyderabad"); // object
        System.out.println(zack.give_id());   //to give respective id
        System.out.println(zack.give_city());  //to give respective city
    }
}
