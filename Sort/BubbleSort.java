package Sort;

import java.util.*;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean notSwap = true;
            for (int j = 0; j < array.length -1 - i; j++) {  // we add -1 because there is j+1
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    notSwap = false;
                }else{
                }
            }
            if(notSwap){
                break;
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
    public static int[] selectionSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[smallest]){
                    smallest = j;
                }
            }
            if (i != smallest){
                int  temp = array[i];
                array[i] = array[smallest];
                array[smallest] = temp; 
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
    // public static int[] insertionSort(int[] array){
    //     for(int i=0;i<array.length;i++){
    //         // j
    //         // while(j)
    //     }
    // }
    public static void main(String[] args) {
        int[] array = { 1, 3, 2, 0, 8, 5, 4 };
        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(array));
        System.out.println("-----------------------------------------");
        int[] sortedArray = selectionSort(array);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(sortedArray));
    }
}


// Why we are not using second array?
// create a new array, find the smallest and then put into the index i, 
// _--> It can be done but if the size is too big then its a problem we can't afford that