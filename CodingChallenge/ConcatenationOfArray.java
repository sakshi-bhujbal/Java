

public class ConcatenationOfArray {
   public static void main(String args[]){
    int arr[]={1,2,3};
    int n=arr.length;
    int ans[]=new int[2*n];

    for(int i=0;i<n;i++){
        ans[i]=arr[i];
        ans[i+n]=arr[i];

    }
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
    }
   }
}
