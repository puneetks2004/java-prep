//IllegalArgumentException 
package chapter_14;

public class project_04 {
    public static void call(int val) {

        if (val < 0) {
            throw new IllegalArgumentException("value less than 0");
        }

        System.out.println(val);
    }

    public static void main(String[] args) {
        call(-4);
    }
}
