public class Solution {
    public static int findNumbers(int[] nums) {
        int evenDigitCount = 0;

        for (int num : nums) {
            if (countDigits(num) % 2 == 0) {
                evenDigitCount++;
            }
        }

        return evenDigitCount;
    }

    private static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println("Output: " + findNumbers(nums));  // Output should be 2
    }
}
