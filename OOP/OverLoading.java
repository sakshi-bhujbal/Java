package OOP;

class MyHouse{
    void cleanHouse(){
        System.out.println("Cleaning the main house");
    }

    void cleanHouse(int noOfRooms){
        System.out.println("Cleaning "+noOfRooms+" rooms");
    }

    void cleanHouse(String roomType){
        System.out.println("Cleaning the "+roomType);
    }
}
public class OverLoading {
    public static void main(String args[]){
        MyHouse myHouse=new MyHouse();
        myHouse.cleanHouse();
        myHouse.cleanHouse(5);
        myHouse.cleanHouse("Bedroom");
    }
}
