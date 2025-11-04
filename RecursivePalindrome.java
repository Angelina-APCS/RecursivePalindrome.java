/* 
Author: Angelina Lu
Date: 11/4/2025
*/

public class RecursivePalindrome {
    public static boolean isPalindrome(String s) {
        // String.charAt(int i): returns the character at index i
        // Return a boolean
        if (s.length() == 0 || s.length() == 1){
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        } else {
            return isPalindrome(s.substring(1, s.length()-1));
        }
    }

    public static void main (String[] args) {
        String word = "REPAPER";
        String word2 = "STARS";
        System.out.println(word + " : " + isPalindrome(word));
        System.out.println(word2 + " : " + isPalindrome(word2));
    }
}