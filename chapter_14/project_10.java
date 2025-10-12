//throw keyword
package chapter_14;

public class project_10 {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        }
        System.out.println("You are eligible");
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
