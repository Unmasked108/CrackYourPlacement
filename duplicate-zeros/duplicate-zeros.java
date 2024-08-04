import java.util.Arrays;

public class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        // Count the number of zeros in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        // Start from the end of the array
        int i = n - 1;
        int j = n + zeros - 1;

        // Traverse the array backwards
        while (i < j) {
            if (j < n) {
                arr[j] = arr[i];
            }

            if (arr[i] == 0) {
                j--;
                if (j < n) {
                    arr[j] = 0;
                }
            }
            i--;
            j--;
        }
    }

    // public static void main(String[] args) {
    //     Solution sol = new Solution();
    //     int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
    //     sol.duplicateZeros(arr);
    //     System.out.println("Output: " + Arrays.toString(arr));
    // }
}
