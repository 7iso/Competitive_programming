package Recursion;

public class exercice35 {
    public static void reverse(int[] tab, int i, int j) {
        // Base case: if i is greater than or equal to j, stop the recursion
        if (i >= j) {
            return;
        }

        // Swap values at positions i and j-1
        int temp = tab[i];
        tab[i] = tab[j - 1];
        tab[j - 1] = temp;

        // Recursive call with a smaller subproblem
        reverse(tab, i + 1, j - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Example usage: reverse the values between index 0 and index 5
        reverse(array, 0, 5);

        // Print the reversed array
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

