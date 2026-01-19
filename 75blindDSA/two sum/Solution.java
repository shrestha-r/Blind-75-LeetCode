import java.util.HashMap;

public class Solution {
    public static int[] solution(int nums[], int target){
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            numsMap.put(nums[i], i);
        }
        System.out.println();
        for(int i=0;i<numsMap.size();i++){
            int right = Math.abs(target - nums[i]);
            if(numsMap.containsKey(right)){
                return new int[] {i,numsMap.get(right)};
            }
        }
        return new int[] {};
    }
    public static void main(String args[]){
        int[] solution = solution(new int[] {2,6,5,8,11},14);
        for(int i: solution){
            System.out.println(i);
        }
    }
}