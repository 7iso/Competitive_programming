package Recursion;

public class verlan {
    public static String verlan(String input) {
        // Base case: if the input string is empty or has only one character, return it as is
        if (input.length() <= 1) {
            return input;
        } else {
            // Recursive step: concatenate the last character with the reversed substring
            return input.charAt(input.length() - 1) + verlan(input.substring(0, input.length() - 1));
        }
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(verlan("hello"));       // "olleh"
        System.out.println(verlan("world"));       // "dlrow"
        System.out.println(verlan("example"));     // "elpmaxe"
    }
    
}
