package OOP;

class Furniture{
    static{
    System.out.println("hi");
    }
    void use(){
        System.out.println("Using furniture");
    }
    void purpose(){
        System.out.println("Used for sitting");
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
        sofa sofa=new sofa();
        
        sofa.purpose();
        sofa.use();
        bench bench=new bench();
        bench.use();
        
        
    }
}
