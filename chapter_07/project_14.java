package chapter_07;

public class project_14 {      //vararggs

    static int sum(int... arr) {
        int result = 0;

        for (int a : arr) {
            result += a;
        }
        return (result);
    }

    public static void main(String[] args) {
        System.out.println("the sum of 1 is " + sum(1));
        System.out.println("the sum of 1 , 3 is " + sum(1, 3));
        System.out.println("the sum of 1 , 4, 6 is " + sum(1, 4, 6));
        System.out.println("the sum of 5,3,9,5,7 is " + sum(15, 3, 9, 5, 7));
        System.out.println("sum of null is " +sum());//empty refers to empty array
    }
}
