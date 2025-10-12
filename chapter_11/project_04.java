package chapter_11;//abstract class having only abstract methods

abstract class male {
    public abstract void weight();

    public abstract void deathday();
}

class dooms extends male {
    public void weight() {
        System.out.println("great");
    }

    public void deathday() {
        System.out.println("whatsup");
    }
}

public class project_04 {
    public static void main(String[] args) {
        dooms obj = new dooms();
        obj.weight();
        obj.deathday();
    }
}
