package chapter_11;

interface medal_1 {

    void meth1();

    void meth2();
}

interface medal_2 {

    void meth3();

    void meth4();

}

class medal_3 {

    public void heavy() {
        System.out.println("dollar");
    }

}

class hammer extends medal_3 implements medal_1, medal_2 {

    public void meth1() {
        System.out.println("hello sir");
    }

    public void meth2() {
        System.out.println("greetings");
    }

    public void meth3() {
        System.out.println("hosting");
    }

    public void meth4() {
        System.out.println("kiran");
    }

    //its own method
    public void fox()
    {
        System.out.println("fox");
    }
}

public class project_20 {
    public static void main(String[] args) {

        medal_1 obj = new hammer();//will run only methods of medal_1
        //obj.meth3(); //not allowed here since does not belong to medal_1
        obj.meth1();//allowed since present in interface 1
        obj.meth2();// allowed since present in interface 1

        //even cannot run methods of hammer itself, rather will only restrict to medal_1
        //obj.fox();//shows undefined

        //if i do 
        hammer gh = new hammer();
        gh.meth1();
        gh.meth4();
        gh.heavy();//function of class medal_3
        gh.fox();//function of class 
    }
}
