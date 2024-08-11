class Solution {
    public int thirdMax(int[] nums) {
        
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        
        Set<Integer> seen = new HashSet<>();
        
        for(Integer num: nums){
            if(seen.contains(num)){
                continue;
            }
            seen.add(num);
            if(max1 == null || num>max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if(max2 == null || num>max2){
                max3 = max2;
                max2 = num;
            }else if(max3 == null || num>max3){
                max3 = num;
            }
        }
        return max3 == null ? max1:max3;
 
    }
}