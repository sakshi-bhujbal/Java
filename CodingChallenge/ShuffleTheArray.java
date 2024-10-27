// {1,2,3,9,8,7}{x1,x2,...xn,y1,y2,..yn}
// {1,9,2,8,3,7}{x1,y1,x2,y2,....xn,yn}

public class ShuffleTheArray {
    public static void main(String args[]){
        int arr[]={1,2,3,9,8,7};
        int n=arr.length/2;
        int ans[]=new int[2*n];

        for(int i=0;i<n;i++){
            ans[2*i]=arr[i];
            ans[2*i+1]=arr[i+n];
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
