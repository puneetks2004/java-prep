package chapter_11;

interface pinacle {

    void at_top();

    void paramount(int fool);
}

class pioneer implements pinacle {

    public void joker()// its own method
    {
        System.out.println("will make you laugh");
    }

    public void at_top() // abstract method of interface
    {
        System.out.println("love to be at top");
    }

    public void paramount(int fool)// abstract method of interface
    {
        System.out.println("uber not urban");
    }
}

public class project_08 {
    public static void main(String[] args) {

        pioneer obj = new pioneer();
        obj.joker();//its own method
        obj.at_top();
        obj.paramount(9);// since needed to pass a argument
    }
}
