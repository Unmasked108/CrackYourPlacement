class Solution {
    public int[] replaceElements(int[] arr) {
        
               int n = arr.length;
        int maxRight = -1;  // Initialize maxRight with -1

        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];  // Store the current element
            arr[i] = maxRight;  // Replace the current element with maxRight
            if (current > maxRight) {
                maxRight = current;  // Update maxRight if current element is greater
            }
        }

        return arr;
    }
}