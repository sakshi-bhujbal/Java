package OOP;

class Furniture{
    void use(){
        System.out.println("Using furniture");
    }
} 

class sofa extends Furniture{
    void use(){
        System.out.println("Sitting on sofa");
    }
}

class bench extends Furniture{
    void use(){
        System.out.println("Sitting on the bench");
    }
}

public class Polymorphism {
    public static void main(String args[]){
        Furniture sofa=new sofa();
        Furniture bench=new bench();
        sofa.use();
        bench.use();
        
    }
}
