package chapter_11;

abstract class telephone {

    public abstract void ring();

    public abstract void lift();

    public abstract void disconnect();
}

class smart_telephone extends telephone {

    public void ring() {
        System.out.println("ringing");
    }

    public void lift() {
        System.out.println("lift");
    }

    public void disconnect() {

        System.out.println("disconnecting");

    }

    public void connect() {// extra

        System.out.println("connecting");

    }

}

public class que_04 {
    public static void main(String[] args) {

        telephone obj = new smart_telephone();// allows to only run methods of class telephone
        // obj.connect();//since method does not belong to class telephone but
        // smart_telephone
        obj.disconnect();
        obj.ring();
        obj.lift();
    }
}
