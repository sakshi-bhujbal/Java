package Arrays;
import java.util.Scanner;
public class Print2DArray {
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of 2D array: ");
    int rows=sc.nextInt();
    int cols=sc.nextInt();
    int [][] arr=new int[rows][cols];

    System.out.println("Enter the array elements: ");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
        arr[i][j]=sc.nextInt();
       
    }
}
    System.out.println("the array elements are: ");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
        System.out.print(arr[i][j]+" ");
       }
       System.out.println();
}
}
}   
