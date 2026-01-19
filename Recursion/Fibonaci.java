package Recursion;
public class Fibonaci {
    public static int calFib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return calFib(n-1)+calFib(n-2);
    }
    public static void main(String[] args) {
        int n = calFib(6);
        System.out.println(n);
    }
}
