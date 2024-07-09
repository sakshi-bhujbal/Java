package Strings;
import java.util.Scanner;
public class ReverseAString {
    public static void main(String args[]){
    String str="Hello";
    String str1="";
    int end=str.length();
    System.out.println(end);
    for(int i=end-1;i>=0;i--){
        str1=str1+str.charAt(i);
    }
    System.out.println(str1);
}
}