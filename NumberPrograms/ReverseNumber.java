package NumberPrograms;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number;
        int sum=0;
        while(number>0){
            int rem=number%10;
            sum=sum*10+rem;
            number=number/10;
        }
        if(sum==temp){
            System.out.println("The number is reverse of original");
        }
        else{
            System.out.println("The number is not reverse");
        }
    }
}
