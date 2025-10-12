//in class

//------------------------------->can easily inherit
// package chapter_15;

// class A {
//     void show()
//     {
//         System.out.println("get it");
//     }
// }

// class B extends
//         A {

// }

// public class project_11 {
//     public static void main(String[] args) {
//         B obj = new B();
//         obj.show();
//     }
// }



//---------------------------------->with final keyord cannot inherit anymore
package chapter_15;

final class A {
    void show() {
        System.out.println("get it");
    }
}

// class B extends
//         A {

// }

public class project_11 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
