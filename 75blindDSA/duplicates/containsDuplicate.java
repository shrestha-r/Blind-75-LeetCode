package duplicates;

import java.util.HashMap;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numsMap.containsKey(nums[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,2};
        containsDuplicate(nums);
    }
}