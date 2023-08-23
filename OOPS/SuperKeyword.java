package OOPS;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse12 h = new Horse12();
        System.out.println(h.color);
    }
}

class Animal12{
    protected String color;
    Animal12(){
        System.out.println("Animal Constructor is called");
    }
}

class Horse12 extends Animal12{
    Horse12(){
//        super();
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}
