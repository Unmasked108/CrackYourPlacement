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
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.println("Output: " + k1 + ", nums = " + Arrays.toString(Arrays.copyOf(nums1, k1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.println("Output: " + k2 + ", nums = " + Arrays.toString(Arrays.copyOf(nums2, k2)));
    }
}
