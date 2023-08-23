package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        //Run time Polymorphism
//        Calculator c1 = new Calculator();
//        System.out.println(c1.sum(2,4));
//        System.out.println(c1.sum( 2,4,6));
//        System.out.println(c1.sum((float)2.1,(float)4.1));

       //Compile time Polymorphism
        deer d1 = new deer();
        d1.eat();
    }
}

class Animal1{
    void eat(){
        System.out.println("Eats anything");
    }
}

class deer extends Animal{

    void eat(){

        System.out.println("Eat grass");
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}
