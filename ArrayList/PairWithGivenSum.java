package ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class PairWithGivenSum{

    public static List<int[]> pairsWithSum(int[] arr, int target){

        //Edge case
        if(arr == null || arr.length == 0){
            return new ArrayList<>();
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> used = new HashSet<>();
        List<int[]> result = new ArrayList<>();

        for (int num : arr){
            int required  = target - num;

            if(seen.contains(required) && !used.contains(num)){
                result.add(new int[]{required , num});
                used.add(required);
                used.add(num);
            }
            seen.add(num);
        }

        return result;
    }

    public static void main (String[] args){
        int[] arr = {1, 4, 5, 6, 8, 4};
        int target = 9;
        List<int[]> pairs = pairsWithSum(arr, target);

        if (pairs.isEmpty()) {
            System.out.println("No pairs found.");
        } else {
            System.out.println("Pairs found:");
            for (int[] pair : pairs) {
                System.out.println(pair[0] + " + " + pair[1] + " = " + target);
            }
        }
    }
}