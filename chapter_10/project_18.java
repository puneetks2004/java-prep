package chapter_10;

class class1 {

    public void meth1() {
        System.out.println("currently in meth1 of class class1");
    }
}

class class2 extends class1 {
    
    public void meth1() {//redefinig the same funtion
        System.out.println("currently in meth1 of class class2");//on calling this overrides class1 method which has same name etc priority is given to its own method although extends
    }
}

public class project_18 {
    public static void main(String[] args)
    {
        class1 obj = new class1();
        obj.meth1();
        class2 obje = new class2(); //doing overridding 
        obje.meth1();

    }
}