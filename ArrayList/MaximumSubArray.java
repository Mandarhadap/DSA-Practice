package ArrayList;
public class MaximumSubArray{
    public static int maxSubArray(int[] arr){
        //edge case
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be Empty");
        }

        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1 ; i < arr.length; i++){
            currentSum = Math.max(arr[i],currentSum+arr[i]);

            maxSum = Math.max(maxSum , currentSum);
        }
        return maxSum;
    }
    public static void main (String[] args){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(arr);
        System.out.println(result);
    }
}
