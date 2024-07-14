// import java.util.Scanner;
// public class Factorial {
//     public static void main(String args[]){
//         int fact=1;
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//             System.out.println(fact);
//         }
//         System.out.println("Factorial of "+n+" is " +fact);
//     }
// }

public class Factorial{
    static int factorial(int n){
        if(n==0)
        return 1;
        else
        return(n*factorial(n-1)); 
    }
    public static void main(String args[]){
        int fact;
        int number=5;
        fact=factorial(number);
        System.out.println(fact);
    }
}