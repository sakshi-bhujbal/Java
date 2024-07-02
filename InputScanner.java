import java.util.Scanner;
public class InputScanner{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("The entered string is: "+str);

        System.out.println("Enter a number: ");
        int it=sc.nextInt();
        System.out.println("The entered integer is: "+it);

        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        System.out.println("The character at 0th index is: "+ch);
    }
}