public class ArmstrongNumber {
    public static void main(String args[]){
        int number=370;
        int sum=0;
        int temp=number;
        while(number>0){
            int rem=number%10;
            sum=sum+rem*rem*rem;
            number=number/10;
        }
        if(temp==sum){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
