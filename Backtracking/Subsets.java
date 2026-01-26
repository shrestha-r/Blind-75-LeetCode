package Backtracking;
import java.util.*;

public class Subsets {

    public static void main(String[] args) {
        int[] nums = {1, 2};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        System.out.println(result);
    }                        

    private static void backtrack(int[] nums, int idx, List<Integer> curr, List<List<Integer>> result) {
        result.add(new ArrayList<>(curr));
        System.out.println(result);


        for(int i = idx;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums, i+1, curr, result);

            curr.remove(curr.size()-1);
        }
    }
}
