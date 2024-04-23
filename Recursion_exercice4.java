package Recursion;

public class exercice4 {
    public static boolean palindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }

        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return palindrome(word.substring(1, word.length() - 1));
        } else {
            return false;
        }
        
    }

    public static void main(String[] args) {
        System.out.println(palindrome("radar"));       // true
        System.out.println(palindrome("ressasser"));   // true
        System.out.println(palindrome("enseignant"));  // false
    }
}

