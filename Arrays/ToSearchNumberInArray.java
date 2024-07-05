package Arrays;
import java.util.*;
public class ToSearchNumberInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int search[]={12,56,34,78,23,90};

        System.out.println("Enter the number to be searched: ");
        int key=sc.nextInt();

        int size=search.length;
        for(int i=0;i<size;i++){
            if(search[i]==key){
                System.out.println("The key found at "+i+" index");
            }
        }
    }
}
