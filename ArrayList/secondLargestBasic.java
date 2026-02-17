package ArrayList;

public class secondLargestBasic{
    public static int findSecondLargest(int[] arr){

        //Edge case
        if(arr == null || arr.length < 2){
            throw new IllegalArgumentException("Array must have atleast 2 elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                secondlargest = largest;
                largest = num;
            }else if(num > secondlargest && num != largest){
                secondlargest = num;
            }
        }
        if(secondlargest == Integer.MIN_VALUE){
            throw new IllegalArgumentException("No distinct Second Largest Element");
        }
        return secondlargest;
    }
    public static void main (String[] args){
        int[] arr = {10, 20, 4, 45, 99};
        int result = findSecondLargest(arr);
        System.out.println(result);
    }

}