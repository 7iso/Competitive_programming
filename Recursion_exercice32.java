package Recursion;

public class exercice32 {
    public static void multiply(int[] tab, int x, int j){
        if (j == 0){
            return;
        }
        tab[j - 1] *= x;
        multiply(tab, x, j - 1);
    }

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};

        multiply(array, 2, 5);

        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

