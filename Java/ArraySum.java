public class ArraySum {
    public static void sum(int[] arr,int i){
        if(i==arr.length-1) return;
        System.out.println(arr [i]+sum(arr, i+1));
    }
    public static void main(String[] args) {
        
    }
}
