package OOPS;

public class CopyConstructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Arpit Sharma";
        s1.password = "dsdfsdfsdfs";
        s1.roll = 20;
        s1.marks[0] = 80;
        s1.marks[1] = 90;
        s1.marks[2] = 100;

        Student1 s2 = new Student1(s1);
        s2.password = "xyz";
        s1.marks[2] = 101;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student1{
    String name;
    int roll;
    String password;
    int marks[];

    Student1(){
        marks = new int[3];
        System.out.println("Non-Parametrized Constuctor called");
    }

    //copy constructor - shallow
//    Student1(Student1 s1){
//        System.out.println("Shallow Copy constructor initiated");
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        // refrence is copied here not the array so thats why if we change value in s1 then changes will be depicted in s2
//        this.marks = s1.marks;
//    }

    Student1(Student1 s1){
        System.out.println("Deep Copy constructor initiated");
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i< marks.length;i++){
            marks[i] = s1.marks[i];
        }
    }
}
