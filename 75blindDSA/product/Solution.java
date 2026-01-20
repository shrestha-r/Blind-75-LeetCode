// // package 75blindDSA.product;
// import java.util.Arrays; 

// public class Solution {
//     public static void solution(int[] nums){
//         int productOfArray = 1;
//         for(int i=0;i<nums.length;i++){
//             productOfArray = productOfArray * nums[i];
//         }
//         int[] arr = new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             arr[i] = productOfArray/nums[i];
//         }
//         System.out.println(Arrays.toString(arr));

//     }
//     public static void main(String[] args) {
//         int[] nums = {1,2,3,4};
//         solution(nums);
//     }
// }

import java.util.*;
class Solution {

    public static int[] productExceptSelf(int nums[]){
        int productOfArray = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                continue;
            }
            productOfArray = productOfArray * nums[i];
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if (nums[i] ==0){
                arr[i] = productOfArray;
            }
            if(nums[i] != 0){
                arr[i] = productOfArray/nums[i];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

}




