package SortedsquareOfA;

public class SortedSquare {
    public static int[] sortedSquareArray(int[] array){
        for(int i =0;i<=array.length;i++){
            array[i] *= array[i];
        }
        int left = array[0];
        int n = array.length;
        int right = array[n-1];

        while(left<=right){

        }
        return array;
    }
    public static void main(String[] args) {
        
    }
}


[-1,-2,0,1,2,3]