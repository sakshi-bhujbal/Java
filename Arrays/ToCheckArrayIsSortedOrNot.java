package Arrays;
import java.util.*;
public class ToCheckArrayIsSortedOrNot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("the array elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        boolean isAscending=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending=false;
            }
        }
        System.out.println();
        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        }
        else{
            System.out.println("The array is not sorted in ascending order");
        }
    }
}
