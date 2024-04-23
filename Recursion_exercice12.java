package Recursion;

public class exercice12 {

    public static void main(String[] args) {
        int n = 5; // You can change the value of n as needed
        afficheNombresCroissant(n);
    }

    public static void afficheNombresCroissant(int n) {
        
        if (n >= 1) {

            afficheNombresCroissant(n - 1);
            
            System.out.println(n);
        }
    }
    
}
