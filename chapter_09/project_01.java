package chapter_09;

class myemployee {
    private int id; // access modifier as private
    private String name; // access modifier as private

    public void setname(String j) { // setter used to set
        name = j;
    }

    public String getname() { // getter used to get value
        return name;
    }

    public void setid(int i) { // setter used to set
        id = i;
    }

    public int getid() { // getter used to get value
        return id;
    }
}

public class project_01 {
    public static void main(String[] args) {
        myemployee value = new myemployee();
        // value.id = 99;
        // value.name = "puneet"; unable to set value because private access modifier
        // above

        value.setname("puneet kumar");    //setting value of attribute
        value.setid(44);

        System.out.println(value.getname());    //calling through getter
        System.out.println(value.getid());        //calling through getter

    }
}
