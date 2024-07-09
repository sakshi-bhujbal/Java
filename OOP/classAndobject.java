package OOP;

public class classAndobject {
    public static void main(String args[]){
        class House{
            String color;
            int noOfRooms;

            void paintHouse(String newColor){
                color=newColor;
            }

        }
        House myHouse=new House();
        myHouse.color="Blue";
        myHouse.noOfRooms=5;
        myHouse.paintHouse("White");
        System.out.println("Color is: "+myHouse.color);
        System.out.println("The rooms are: "+myHouse.noOfRooms);
    }
}
