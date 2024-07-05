package Arrays;
import java.util.*;
public class ArrayInputOutput {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int numbers[]=new int[size];

        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("The array elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
