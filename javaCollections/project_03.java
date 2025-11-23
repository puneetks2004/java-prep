// package javaCollections;

// import java.util.*;

// //max element using recursion

// public class project_03 {


//     public static int calculateMax(int [] arr,int n)
//     {
//        if(n==arr.length-1)
//        {
//            return arr[arr.length-1];//return element present at last
//        }

      
//        int val = calculateMax(arr, n + 1);
       
//        if(val>arr[n])
//        {
//            return val;
//        }
//        else {
//            return arr[n];
//        }
        


//     }

//     public static void main(String[] args)
//     {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter the size of array");

//         int n = scn.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter the value of array");

//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i]=scn.nextInt();
//         }

//         int ans=calculateMax(arr,0);
//         System.out.println(ans);
//     }
// }


package javaCollections;

import java.util.*;

//max element using recursion

public class project_03 {

    public static int calculateMax(int[] arr, int n) {
        if (n == 0) {
            return arr[0];// return element present at last
        }

        int val = calculateMax(arr, n - 1);

        if (val > arr[n]) {
            return val;
        } else {
            return arr[n];
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the value of array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = calculateMax(arr, arr.length-1);
        System.out.println(ans);
        scn.close();
    }
}
