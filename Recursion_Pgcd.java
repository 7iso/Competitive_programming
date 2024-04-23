package Recursion;

public class Pgcd {

    public static int pgcd(int a, int b) {
        // Base case: if b is 0, the gcd is a
        if (b == 0) {
            return a;
        } else {
            // Recursive step: calculate gcd using Euclidean algorithm
            return pgcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(pgcd(2, 3));    // 1
        System.out.println(pgcd(42, 54));  // 6
        System.out.println(pgcd(0, 5));    // 5 (gcd with 0 is the other number)
        System.out.println(pgcd(15, 0));   // 15 (gcd with 0 is the other number)
    }
    
}
