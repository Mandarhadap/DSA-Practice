package ArrayList;
public class BestTimeToBuySellStock{
    public static int maxProfit(int[] arr){

        //Edge Case
        if(arr == null || arr.length < 2){
            return 0;
        }

        int minPrice = arr[0];
        int maxProfit = 0;

        //Start from day 1
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            } else{
                int profit = arr[i]-minPrice;
                maxProfit = Math.max(maxProfit , profit);
            }
        }
        return maxProfit;
    }
    public static void main (String[] args){
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println(result);
    }

}
