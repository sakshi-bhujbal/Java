package Recursion;

public class FactorialOfNumbers {
    public static void printFact(int i,int n,int fact){
        if(i==n)
        {
            fact=fact*i;
            System.out.println(fact);
            return;
        }
        fact=fact*i;
        printFact(i+1,n,fact);

    }

    public static void main(String args[]){
        printFact(1,5,1);
    }
}
