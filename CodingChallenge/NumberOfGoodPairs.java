import java.util.ArrayList;

public class NumberOfGoodPairs {
    public static void goodPairs(int num[]){
        int count=0;
        ArrayList <String> pairs=new ArrayList<>();
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j] && i<j){
                     count++;
                     pairs.add("("+num[i]+","+num[j]+")");
                }
            }
            
        }
      
     System.out.println("The count of good pairs is: "+count);

     System.out.println("The good pairs is:"+pairs);
    }
    public static void main(String args[]){
        int num[]={1,2,3,1,1,3};
       goodPairs(num);
        
    }
}

