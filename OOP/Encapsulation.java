package OOP;


        class House{
            private String color;
            private int noOfRooms;

            public String getColor(){
                return color;
            }

            public void setColor(String newColor){
                this.color=newColor;
            }

            public int getNumberOfRooms(){
                return noOfRooms;
            }

            public void setNoOfRooms(int newNumber){
                this.noOfRooms=newNumber;
            }
        
       
        }

        public class Encapsulation {
            public static void main(String args[]){
                        House myHouse=new House();
                        myHouse.setColor("Blue");
                        myHouse.setNoOfRooms(4);
                        System.out.println("Color: "+myHouse.getColor());
                        System.out.println("Color: "+myHouse.getNumberOfRooms());
                }
            }