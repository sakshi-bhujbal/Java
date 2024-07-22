package OOP;

abstract class Appliance{
    abstract void turnOn();
    abstract void turnOff();
}

class Light extends Appliance{
    void turnOn(){
        System.out.println("Turning on the light");
    }

    void turnOff(){
        System.out.println("Turning off the light");
    }
}


public class Abstraction {
    public static void main(String args[]){
        Light light=new Light();
        light.turnOn();
        light.turnOff();
    }
}
