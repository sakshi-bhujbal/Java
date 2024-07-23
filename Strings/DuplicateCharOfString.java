package Strings;
import java.util.*;
public class DuplicateCharOfString {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String str1=str.toLowerCase();
    System.out.println(str1);
    System.out.println("The Duplicate characters are: ");
    int count=0;
   for(int i=0;i<str1.length();i++){
        for(int j=i+1;j<str1.length();j++){
            if(str1.charAt(i)==str1.charAt(j)){
                count=count+1;
                
                System.out.print(str1.charAt(i)+" ");
            }
        }
    }
    System.out.println();
    System.out.println("Count is : "+count);
}
}