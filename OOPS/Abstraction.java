package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
        Chicken c = new Chicken();
        c.walk();
        c.eat();
    }
}
// In this Animal Abstract class gives idea of walk() with no parameters so that Horse and Chicken class can implement that idea
abstract class Animal2{
    String color;

    Animal2(){
        color = "brown";
        System.out.println("Animal Constructor Called");
    }

    //non-abstract method
    void eat(){
        System.out.println("Eats");
    }
    //abstract method
    abstract void walk();
}

class Horse extends Animal2{
    Horse(){
        System.out.println("Horse Constructor Called");
    }

    void changeColor(){
        color = "Black";
    }

    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal2{
    Chicken(){
        System.out.println("Chicken Constructor Called");
    }

    void changeColor(){
        color = "yellow";
    }

    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
