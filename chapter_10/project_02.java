package chapter_10;


    class base_1 {
        int x;

        public void set_x(int j) {
            x = j;
        }

        public int get_x() {
            return x;
        }
    }

    class derived_1 extends base_1 {

        
        }
    

public class project_02 {
    public static void main(String[] args) {
        base_1 kk = new base_1();
        kk.set_x(99);
        derived_1 kk_ = new derived_1(); // you can create many number of objects of same class
        kk_.set_x(345);
       

        System.out.println(kk.get_x());
        System.out.println(kk_.get_x());
        
    }
}
