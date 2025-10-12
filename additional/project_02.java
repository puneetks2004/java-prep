package additional;

public class project_02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("puneet");
        System.out.println(sb.capacity()); // included size of puneeti.e.=6+16=22characters

        System.out.println(sb.length()); //gives length of string here 6

        //append
        sb.append(" srivastava");
        System.out.println(sb);
        System.out.println(sb.length());

        
    }         
}
