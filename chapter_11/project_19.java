package chapter_11;//inheritance in interfaces

interface ruby {

    void meth1();

    void meth2();

}

interface pukhraj extends ruby {// inheriting interface ruby

    void meth3(); // meth1() and meth2() already involved inherited

    void meth4();

}

// surely need to create a class to implement

class fact implements pukhraj {//in class need to define all methods

    public void meth1() {
        System.out.println("i am rubina");
    }

    public void meth2() {
        System.out.println("i am kajal");
    }

    public void meth3() {
        System.out.println("i am kashish");
    }

    public void meth4() {
        System.out.println("i am sanchi");
    }
}

public class project_19 {
    public static void main(String[] args) {
        fact obj = new fact();//object of class 
        obj.meth1();
        obj.meth2();//calling methods
        obj.meth3();
        obj.meth4();
    }
}
