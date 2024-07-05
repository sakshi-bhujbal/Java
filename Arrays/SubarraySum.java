package Arrays;
public class SubarraySum {
    public static int[] findSubarrayWithGivenSum(int[] arr, int targetSum) {
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > targetSum && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == targetSum) {
                int[] result = new int[end - start + 1];
                for (int i = 0; i < result.length; i++) {
                    result[i] = arr[start + i];
                }
                return result;
            }
        }

        return null; // Return null if no subarray with the given sum is found
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 31, 9, 21, 8};
        int targetSum = 45;

        int[] result = findSubarrayWithGivenSum(arr, targetSum);

        if (result != null) {
            System.out.print("Subarray with given sum: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("No subarray with the given sum found.");
        }
    }
}
