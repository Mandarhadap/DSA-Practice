package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class removeDublicatesSorted{

    public static List<Integer> removeDublicates(int[] arr){

        List<Integer> list = new ArrayList<>();

        //Edge Case if the array is null and empty
        if(arr == null || arr.length == 0){
            return list;
        }

        // add the first element that is always unique
        list.add(arr[0]);

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main (String[] args){
        int[] arr = {1,1,2,3,3,4,4,5,5,6};
        List<Integer> result = removeDublicates(arr);
        System.out.println(result);
    }


}