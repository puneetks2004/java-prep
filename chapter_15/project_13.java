//static variable
package chapter_15;

//------------------------>normal way
// class mega {
//     int price;
//     String brand;
//     String type;

//     public void get() {
//         System.out.println(price + " : " + brand + " : " + type);
//     }

// }

// public class project_13 {
//     public static void main(String[] args) {
//         mega obj1 = new mega();
//         obj1.price = 345;
//         obj1.brand = "samsung";
//         obj1.type = "smartPhones";

//         mega obj2 = new mega();
//         obj2.price = 908;
//         obj2.brand = "realme";
//         obj2.type = "smartPhones";

//         obj1.get();
//         obj2.get();

//     }
// }

class mega {
    int price;
    String brand;
    static String type;// becomes a common variables and so we see chanf=ges in all objects
    // other variables are instance variables which are separate to all objects but
    // static variable is shared by all object
    // first i write value of this static variable as smartphones and then i
    // overwrite it as phones so changes are seen in all

    public void get() {
        System.out.println(price + " : " + brand + " : " + type);
    }

}

public class project_13 {
    public static void main(String[] args) {
        mega obj1 = new mega();
        obj1.price = 345;
        obj1.brand = "samsung";
        mega.type = "smartPhones";// preferred to be accessed using class name rather object name

        mega obj2 = new mega();
        obj2.price = 908;
        obj2.brand = "realme";
        mega.type = "Phones";// preferred to be accessed using class name rather object name

        obj1.get();
        obj2.get();

    }
}

// sttaic variable is different from global variable in terms of scope
// static: Limited to the block/file it's declared in
// global : Accessible from anywhere in the program