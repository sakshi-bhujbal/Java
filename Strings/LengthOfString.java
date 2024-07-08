package Strings;
import java.util.Scanner;

public class LengthOfString {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();

    char[] charArray=str.toCharArray();
    System.out.println(charArray);

        int length=charArray.length;
        
        System.out.println(length);
}
}