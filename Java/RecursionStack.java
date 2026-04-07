public class RecursionStack {
    public static int hello(int n){
        if(n==0){
            return 0;
        }
        System.out.println("Stacking");
        int sum = n+hello(n-1);
        System.out.println(sum);
        System.out.println("Only once?");

        return sum;
    }

    /* 
    stacking
    stacking
    stacking
    statcking
    stacking
    
    */ 
    public static void main(String[] args) {
        System.out.println(hello(5));
    }
}
