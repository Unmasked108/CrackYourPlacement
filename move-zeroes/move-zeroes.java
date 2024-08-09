

public class Solution {
    public void moveZeroes(int[] nums) {
    int nonZeros = 0;
        
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != 0){
                nums[nonZeros] = nums[i];
                nonZeros++;
            }
            
        }
        for(int j = nonZeros ; j<nums.length;j++){
            nums[j]=0;
        }
    }
}