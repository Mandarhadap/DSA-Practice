package Basic;
public class StringRev2Ptr{
    public static String strRev2ptr(String input){
        if(input == null){
            return null;
        }
        //convert string to array as string is immutable
        char[] arr = input.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main (String[] args){
        String str = "Annu";
        String rev = strRev2ptr(str);
        System.out.println("Reversed String: "+ rev);

    }
}
