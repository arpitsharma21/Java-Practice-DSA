package Strings;

public class isPalindrome {
    public static boolean checkPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        //is a palindrome
        return true;
    }

    public static void main(String[] args) {
        String str = "race car";
        System.out.println(checkPalindrome(str));
    }
}
