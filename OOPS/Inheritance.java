package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Tuna tu = new Tuna();
        tu.eat();
        tu.fins();
    }
}
//base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breaths(){
        System.out.println("Breathes");
    }
}

//derived class
class  fish extends Animal{
    int fins;
    void swims(){
        System.out.println("Swim");
    }
}

class Tuna extends fish{
    void fins(){
        System.out.println("fins");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

class Peacock extends  Bird{
    void feathers(){
        System.out.println("Feathers");
    }
}

class Mammal extends  Animal{
    void legs(){
        System.out.println("Legs");
    }
}
