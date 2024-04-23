package Recursion;

public class exercice2 {

    public static void ligne(int n){
        if (n>0){
            System.out.print("* ");
            ligne(n-1);
             
        }




    }
    public static void main (String[] args){
        ligne(5);
    }

    
}
