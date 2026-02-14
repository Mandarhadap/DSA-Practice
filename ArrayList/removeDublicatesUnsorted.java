package ArrayList;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDublicatesUnsorted{
    public static List<Integer> removedublicates(int[] arr){

        //Edgecase if the array is null and empty
        if(arr == null || arr.length == 0){
            return new ArrayList<>();
        }

        //Linked hash set preserves the insertion order
        Set<Integer> set = new LinkedHashSet<>();

        for(int num : arr){
            set.add(num);
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args){
        int[] arr = {3,3,4,4,5,5,8,8,1};
        List<Integer> result = removedublicates(arr);
        System.out.println(result);
    }
}
