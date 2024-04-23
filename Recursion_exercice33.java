package Recursion;

public class exercice33 {
    public static boolean itwillwork(int[] tab, int j) {
        if (j <= 1) {
            return false;
        }

        if (tab[j - 1] == tab[j - 2]) {
            return true;
        } else {
            
            return itwillwork(tab, j - 1);

        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4};
        boolean result = itwillwork(array, 5);
        System.out.println(result);
    }
}

