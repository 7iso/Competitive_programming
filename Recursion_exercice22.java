package Recursion;

public class exercice22 {

    public static void triangle(int n){
        if (n>0){
            triangle(n-1);
            for (int i = 0; i < n ; i++){
                System.out.print("*");
            } System.out.println("");
        }



    }
    public static void main(String[] args){
        triangle(3);
    }
    
    
}
