package chapter_10;

class A {

    int salary;

    public void meth1() {
        System.out.println("I am the method 1 of class A");
    }
}

class B extends A {
    public void meth2() {
        System.out.println("I am method 2 of class 3 ");
    }
}

public class project_17 {
    public static void main(String[] args) {
        A god = new A();// object of class A
        god.meth1();// calling meth2 of class A
        B val = new B();// object of class B
        val.meth2();// calling method
        val.meth1();//calling function of class A

    }
}
