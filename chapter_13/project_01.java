package chapter_13;

class magic {
    public void show1() {
        System.out.println("showing magic_01");
    }

}

class wand1 extends magic {//inheriting
    public void show2() {
        System.out.println("showing magic_02");
    }
}

class wand2 extends magic {//inheriting
    public void show3() {
        while (true) {
            System.out.println("showing magic_03");
        }
    }
}

public class project_01 {

       public static void main(String[] args) {

        wand1 obj = new wand1();//creating object of wand2 class
        obj.show2();//runs  show3 infinite times
        obj.show1();

    }
}


// In Java, defining classes outside the main method is the correct approach
// because Java is an object-oriented programming (OOP) language, and each class
// should be a separate entity.