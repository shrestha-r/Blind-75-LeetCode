package Recursion;

public class Factorial {
    public static int calculateFactorial(int n){
        if(n == 0){
            return 1;
        }
       return n*calculateFactorial(n-1);
    }
    public static void main(String[] args) {
       int n =  calculateFactorial(5);
       System.out.println(n);
    }
}
