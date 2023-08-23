package OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.schoolName = "Valley Public";
        Student2 s2 = new Student2();
        //As s1 defined schholName once it can be used by all the other objects till its value is not changed
        // and then that chnaged value is used by all objects
        System.out.println(s2.schoolName);

        s2.schoolName = "Govt Model";
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
    }
}

class Student2{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
