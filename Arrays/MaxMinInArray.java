package Arrays;

import java.util.*;
public class MaxMinInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The array elements are: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        
        for(int i=0;i<size;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("The max value is: "+max);
        
        for(int i=0;i<size;i++){
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("The min value is: "+min);
    }
}
