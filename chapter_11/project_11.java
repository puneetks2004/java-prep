package chapter_11; //a class extending multiple abstract class not allowed in java

abstract class logic {

    public abstract void joky();

    public abstract void cozi();
}

abstract class kall {

    public abstract void venus();
}

class gamer extends logic,kall{

    public void joky() {
        System.out.println("i am no.1 brand");
    }

    public void cozi() {
        System.out.println("cozi life");
    }

    public void venus() {
        System.out.println("i am venus");
    }
}

public class project_11 {
    public static void main(String[] args) {
        gamer obj = new gamer();
        obj.joky();
        obj.cozi();
        obj.venus();
    }
}
