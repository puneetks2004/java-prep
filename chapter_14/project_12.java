// //throw vs throws
// package chapter_14;

// public class project_12 {
//     public static int devide(int a, int b) {

//         int c = a / b;
//         return c;

//     }

//     public static void main(String[] args) {
//         int result = devide(10, 0);
//         System.out.println(result);

//     }
// }

//handling using throws
package chapter_14;

public class project_12 {
    public static int devide(int a, int b) throws ArithmeticException {// already informs that can trow exception

        int c = a / b;
        return c;

    }

    public static void main(String[] args) {
        try {
            int result = devide(10, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("issue is " + e);
        }

    }
}