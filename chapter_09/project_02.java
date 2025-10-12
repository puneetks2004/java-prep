package chapter_09;

class define { // custom class
    private int salary;

    public void setsalary(int n) // setter
    {
        salary = n;
    }

    public int getsalary() // getter
    {
        return salary;

    }

}

public class project_02 {
    public static void main(String[] args) {
        define value = new define();
        value.setsalary(900000);

        System.out.println(value.getsalary()); // gives 900000

    }
}
