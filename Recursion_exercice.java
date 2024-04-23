package Recursion;

public class exercice {


    public static void afficheNombresDecroissant(int n){
        if (n>0){
            System.out.println(n);
            afficheNombresDecroissant(n-1);
        }
    }
    public static void afficheNombresCroissant(int n) {
        
        if (n >= 1) {

            afficheNombresCroissant(n - 1);
            
            System.out.println(n);
        }
    }

    public static void main(String[] args){

        afficheNombresDecroissant(5);
        afficheNombresCroissant(6);

   }


    

    
}  

