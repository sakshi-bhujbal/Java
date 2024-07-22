package OOP;

class House {
    void cleanHouse() {
        System.out.println("Cleaning the main house");
    }
}

class GuestHouse extends House {
    @Override
    void cleanHouse() {
        System.out.println("Cleaning the guest house");
    }
}

public class Overriding {
    public static void main(String[] args) {
        House house = new House();
        GuestHouse ghouse = new GuestHouse();
        house.cleanHouse(); // Output: Cleaning the main house
        ghouse.cleanHouse(); // Output: Cleaning the guest house
    }
}
