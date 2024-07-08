package Strings;
import java.util.Scanner;
public class LengthOfArrayOfStrings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int totlen=0;
        String [] arr=new String[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.next();
            totlen+=arr[i].length();
            
        }
        System.out.println(totlen);
    }
}
