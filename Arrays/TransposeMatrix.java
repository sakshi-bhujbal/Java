package Arrays;
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int cols=sc.nextInt();

    int arr[][]=new int[rows][cols];
    System.out.println("Enter the array elements: ");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++){
            arr[i][j]=sc.nextInt();
        }
    }

    System.out.println("The array elements before transpose are: ");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

    System.out.println("The array elements after transpose are: ");
    for(int j=0;j<cols;j++)
    {
        for(int i=0;i<rows;i++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
}