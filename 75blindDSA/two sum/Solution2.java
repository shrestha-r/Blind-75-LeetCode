import java.util.Arrays;

public class Solution2 {
    public static int[] solution(int nums[], int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                System.out.println("Success");
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        System.out.println("Sorry");
        return new int[] {};
    }

    public static void main(String args[]) {
        int[] solution = solution(new int[] { 2, 6, 11, 3, 1 }, 14);
        System.out.println(Arrays.toString(solution));
    }
}