public class PushZeroesAtEnd {
    public static void main(String args[]){
        int arr[]={5,0,7,0,0,3,4,0,1};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
            if(arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
            System.out.print(arr[i]+" ");
        }
       
    }
}
