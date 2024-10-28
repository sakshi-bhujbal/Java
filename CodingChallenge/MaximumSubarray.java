
public class MaximumSubarray {

    public static int MaxSumArray(int nums[]){
        int maxSum=nums[0];
        int currentSum=nums[0];

        for(int i=0;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum + nums[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }



    public static void main(String args[]){
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int result=MaxSumArray(nums);
        System.out.println("The maximum sub array is: "+result);
    }    
}
