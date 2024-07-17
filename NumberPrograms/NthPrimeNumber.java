package NumberPrograms;

public class NthPrimeNumber {
    public static void main(String args[]){
        int n=10;
        int NthPrime=findNthPrime(n);
        System.out.println("The "+n+" th prime number is: "+NthPrime);
    }

    public static int findNthPrime(int n){
        int count=0;
        int num=1;
        int i;
        while(count<n){
            num++;
            for( i=2;i<=num;i++){
                if(num%i==0){
                break;
                }
            }
        
        if(i==num){
            count++;
        }
    }
    
    return num;
}

}