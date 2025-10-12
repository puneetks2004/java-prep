//General
package chapter_15;

public class project_01 {
    public static void main(String[] args)
    {
        int[] arr = new int[4];
        arr[0] = 22;
        arr[1] = 45;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);//if no value than shows 0 not null
    }
}

// In Java, arrays are initialized with default values when they are created,
// depending on the type of the array. In your case, the array arr is of type
// int[], so when you create it, all elements are initialized to the default
// value for the int type, which is 0.