package OOPS;

public class Interfacess {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        System.out.println("***********************************************");
        bear b = new bear();
        b.eats();
        b.meat();
    }
}

interface chessPlayer{
    //implements total abstraction
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up,left,right,bottom,diagonal");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left and right");
    }
}

                            // implementing multiple inheritance
interface Herbivores{
    void eats();
}

interface Carnivores{
    void meat();
}

class bear implements Herbivores,Carnivores{
    public void eats(){
        System.out.println("Bear Herbivores eats grass ");
    }

    public void meat(){
        System.out.println("Bear- Carnivores eats meat");
    }
}


