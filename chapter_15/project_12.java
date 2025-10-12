package chapter_15;

class A {
    final void show() {
        System.out.println("get it");
    }
}

//---------------------------->cannot modify method with final keyword
class B extends
        A {
    void show() {
        System.out.println("meal on wheel");
    }

}

public class project_12 {
        public static void main(String[] args) {
            B obj = new B();
            obj.show();
        }
    }

