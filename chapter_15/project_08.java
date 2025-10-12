//Annotations in java


class parent {
    public void goat() {
        System.out.println("my name is khan");
    }
}

class son extends parent {
    @Override // Here, @Override tells the compiler that this method overrides a method from
              // the superclass.
    public void goat() {
        System.out.println("i am kumar");
    }
}

public class project_08 {
    public static void main(String[] args) {

        son ff = new son();
        ff.goat();

    }

}
