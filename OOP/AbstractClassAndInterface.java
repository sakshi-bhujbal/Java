package OOP;

interface Insurable{
    void insure();
}

abstract class Myhouse{
    abstract void cleanHouse();

    void paintHouse(String color){
        System.out.println("Painting the house "+color);
    }
}

class Mainhouse extends Myhouse implements Insurable{
    void cleanHouse(){
        System.out.println("Cleaning the main house");
    }

    public void insure(){
        System.out.println("Insuring the main house");
    }
}

class GHouse extends Myhouse{
    void cleanHouse(){
        System.out.println("Cleaning the guesthouse");
    }
}


public class AbstractClassAndInterface {
    public static void main(String args[]){
        Mainhouse mhouse=new Mainhouse();
        GHouse ghouse=new GHouse();

        mhouse.cleanHouse();
        ghouse.cleanHouse();

        mhouse.paintHouse("blue");
        ghouse.paintHouse("white");

        mhouse.insure();
    }
}
