package ArrayList;

public class ProductofArrayExceptSelf{
    public static int[] productExceptSelf(int[] arr){
        //Edge Case
        if(arr == null || arr.length == 0){
            return new int[0];
        }

        int n = arr.length;
        int[] result = new int[n];

        //Filling the left side first
        //as on the first iteration the left od index is nothing so this
        result[0]=1;
        for(int i = 1; i < n ; i++){
            result[i] = result[i-1]*arr[i-1];
        }

        //multipliying the right
        int rightProduct = 1;
        for(int i = n-1; i>=0;i--){
            result[i] = result[i]*rightProduct;
            rightProduct = rightProduct * arr[i];
        }

        return result;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        int[] result = productExceptSelf(arr);

        for(int x : result){
            System.out.println(x + " ");
        }

    }
}