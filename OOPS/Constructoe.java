package OOPS;

public class Constructoe {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student sc = new Student("Arpit Sharma");

        System.out.println(sc.name);
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Non-Parametrized Constuctor called");
    }

    Student(String name){
        System.out.println("Parametrized");
        this.name = name;
    }
}
