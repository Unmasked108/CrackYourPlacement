

public class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZero] = nums[i];
                nonZero++;
            }
        }

        for (int j = nonZero; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        System.out.println("Output: " + Arrays.toString(nums)); 
    }
}
