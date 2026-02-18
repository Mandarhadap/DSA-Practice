package Basic;


public class Stringpalindrome{
    public static boolean isPalindrome(String input){
        int left = 0;
        int right = input.length() - 1;

        while(left < right){
            if(input.charAt(left) != input.charAt(right)){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String max = "mandar";
        if(isPalindrome(max)){
            System.out.println("The given String is Palindrome");
        }else{
            System.out.println("is not a palindrome ");
        }
    }
}