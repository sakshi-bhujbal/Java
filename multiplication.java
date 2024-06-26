import java.util.*;
public class multiplication {
    public static void main (String[] args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int x=sc.nextInt();
        System.out.println("Enter the second number");
        int y=sc.nextInt();

        for(int i=1;i<=x;i++){
            sum=sum+y;
        }
        System.out.println("The multiplication of numbers is: "+sum);
        }
    }

