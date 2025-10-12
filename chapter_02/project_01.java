package chapter_02;

public class project_01 {
    public static void main(String[] args) {
        int a = 60;
        int b = 30;
        int result = a + b + 10;
        System.out.println("the result of summition is " + result);//gives addition
        int value = a-b;
        System.out.println("the difference is " + value);//gives difference
        int mul = a * b;
        System.out.println("the result is " + mul);//gives multiplication
        int div = a / b;
        System.out.println("the devision is " + div);//gives quotient
        int mod = a % b;
        System.out.println("the modulus is " + mod);//gives remainder
        int post_increament = a++;  //first print and store increamented value
        System.out.println(post_increament);
        System.out.println(post_increament);
        int pre_increament = ++a; // first increamented value than print
        System.out.println(pre_increament);
        System.out.println(pre_increament);

    }
}
