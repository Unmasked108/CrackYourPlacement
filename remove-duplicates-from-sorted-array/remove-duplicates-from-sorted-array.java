public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 1; // Pointer for placing the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j; // Number of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int k= removeDuplicates(nums);
        System.out.println("Output: " + k+ ", nums = " + Arrays.toString(Arrays.copyOf(nums, k)));

    }
}
