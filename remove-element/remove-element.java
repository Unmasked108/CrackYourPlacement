
public class Solution {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the next position to place a non-val element
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        
        int k = removeElement(nums, val);
        System.out.println("Number of elements not equal to " + val + ": " + k);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, k))); 
    }
}
