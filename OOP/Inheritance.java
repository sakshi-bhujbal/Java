package OOP;
import java.util.*;
class MainHouse{
    int noOfRooms;

    void cleanHouse(){
        System.out.println("CLeaning th main house");
    }
}

class GuestHouse extends MainHouse{
    boolean hasSwimmingPool;

    // void cleanHouse(){
    //     super.cleanHouse();
    //     System.out.println("Cleaning the guest house");
    // }
}


public class Inheritance {
    public static void main(String args[]){
        GuestHouse guestHouse=new GuestHouse();
        guestHouse.noOfRooms=4;
        guestHouse.hasSwimmingPool=true;
        guestHouse.cleanHouse();
    }
}
