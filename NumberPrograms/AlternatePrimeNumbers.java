
import java.util.Scanner;

public class AlternatePrimeNumbers {
    
        public static boolean isPrime(int n){
            if(n<=1){
                return false;
            }
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
        public static void main(String args[]){ 

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the series limit: ");
            int limit=sc.nextInt();
            int count=0;
            for(int i=2;i<=limit;i++){
               if(isPrime(i)){
                count++;
               
               if(count%2!=0){
                System.out.print(i+" ");
               }
            }
            }
    }
}
