package chapter_11;//what if two interface have same method

interface gross {

    void netpay();

    void income();
}

interface indeed {
    void netpay();

}

class high implements indeed, gross {

    public void netpay() {
        System.out.println("getit");
    }

    public void income() {
        System.out.println("get");
    }

}

public class project_14 {
    public static void main(String[] args) {
        high janni = new high();
        janni.netpay();
    }
}
