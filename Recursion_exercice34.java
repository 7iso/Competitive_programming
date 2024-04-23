package Recursion;
public class exercice34 {

    public static boolean isPalindrome(int[] tab, int i, int j) {
        // Base case: if i is greater than or equal to j, it's a palindrome
        if (i >= j) {
            return true;
        }

        // Check if the current elements are equal
        if (tab[i] == tab[j - 1]) {
            // Make a recursive call with a smaller subproblem
            return isPalindrome(tab, i + 1, j - 1);
        } else {
            // If the current elements are not equal, it's not a palindrome
            return false;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4};

        // Example usage: check if the entire array is a palindrome
        boolean result = isPalindrome(array, 0, array.length);

        // Print the result
        System.out.println(result);  // This will print true for the example array
    }
}

