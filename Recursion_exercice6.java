package Recursion;

public class exercice6 {
    public static int boucle2(int n) {
        if (n == 0) {
            return n - 1;
        } else {
            return boucle2(n - 1);
        }
    }
    public static void main(String[] args){
        System.out.println(boucle2(6));
    }
    

    
    
}
