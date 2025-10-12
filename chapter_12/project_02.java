package chapter_12;//checking access modifiers visiblity within same package

class roll {
    protected int x = 3;
    public int y = 334;
    private int z = 23;
    int h = 99;// default

    
}

public class project_02 {
    public static void main(String[] args) {
        roll obj = new roll();
        System.out.println(obj.x);// check for x
        System.out.println(obj.y);// check for y
        //System.out.println(obj.z);// not working for z because private access modifier
        System.out.println(obj.h);// check for h

    }
}


