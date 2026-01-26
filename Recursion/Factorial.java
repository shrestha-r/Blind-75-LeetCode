package Recursion;

public class Factorial {
    public static int fact(int n){
        System.out.println(n);
        if(n==0){
            return 1;
        }
        int fact = n*fact(n-1);
        System.out.println(fact);
        return fact;
    }

    public static void main(String[] args) {
        fact(5);
    }
}

/*
fact(5) 5 * 24 = 120
    fact(4) 4 * 6  = 24 
        fact(3) 3*2 = 6
            fact(2) 2*1 = 2
                fact(1) 1*1 = 1
                    fact(0) --> 1




*/
