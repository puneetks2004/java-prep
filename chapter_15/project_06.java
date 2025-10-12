//tells no. of milliseconds passed from 1 jan 1970 to till now
package chapter_15;

public class project_06 {
    public static void main(String[] args)
    {
        System.out.println(System.currentTimeMillis());//for milliseconds
        System.out.println(System.currentTimeMillis() / 1000);//for seconds
        System.out.println(System.currentTimeMillis() / 3600000);//in hrs
        System.out.println(System.currentTimeMillis() / (3600000 * 24));//no. of days

        long go = 3600000L * 24 * 365;
        System.out.println(System.currentTimeMillis() / go);// no. of years
        //L means long value rather int

    }
}
