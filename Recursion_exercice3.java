package Recursion;

public class exercice3 {

    public static boolean search(int[] tab, int x, int j) {
        // Base case: If j is 0, stop searching (reached the beginning of the array)
        if (j == 0) {
            return false;
        }

        // Check if the element at index j-1 is equal to x
        if (tab[j - 1] == x) {
            return true;
        }

        // Recursive step: Search in the subarray from 0 to j-1
        return search(tab, x, j - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 4;
        int endIndex = 3;

        // Call the search function and print the result
        boolean result = search(array, target, endIndex);
        System.out.println(result);
    }


    
}
