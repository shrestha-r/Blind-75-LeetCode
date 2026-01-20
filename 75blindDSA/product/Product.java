import java.lang.reflect.Array;
import java.util.Arrays;
public class Product {
    public static int product(int nums[],int idx){
        int p = 1;
        for(int i = 0;i<nums.length;i++){
            if (idx == i){
                continue;
            }
            p = p * nums[i];
        }
        return p;
    }
    public static int[] makeArray(int[] nums){
        int[] arr = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            arr[i] = product(nums, i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println((Arrays.toString(nums)));
        System.out.println((Arrays.toString(makeArray(nums))));
        for(int n:makeArray(nums)){
            System.out.println(n);
        }
    }
}