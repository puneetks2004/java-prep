//java date class
package chapter_15;

import java.util.*;

public class project_07 {
    public static void main(String[] args)
    {
        //creating object of date class
        Date hot = new Date();
        System.out.println(hot);
        System.out.println(hot.getTime());//returns milliseconds from 1970
        System.out.println(hot.getSeconds());// returns milliseconds from 1970
        System.out.println(hot.getYear());// returns yrars passed from 1900
    }
}
