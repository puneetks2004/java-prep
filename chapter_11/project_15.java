package chapter_11;//same method in interface and class

interface guard {

    void netpay();

}

class india {
     void netpay() {
        System.out.println("netpay is here");
    }

}

class hi extends india implements guard {

    public void netpay() {
        System.out.println("getit");
    }
}

public class project_15 {
    public static void main(String[] args) {
        hi jan = new hi();
        jan.netpay();
    }
}
