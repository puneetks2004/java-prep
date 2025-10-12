package chapter_07;

public class project_15 {

    static int sum(int x, int... arr) {
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return (result);
    }

    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(2, 4));
        System.out.println(sum(9, 5, 4));
        // System.out.println(sum());    will throw error because not taking any arguments
    }
}
