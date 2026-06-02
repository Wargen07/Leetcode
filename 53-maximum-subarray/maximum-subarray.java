class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE,current_sum = 0;
        for(int x : nums){
                current_sum += x ;
                maxsum = Math.max(current_sum , maxsum);
                if(current_sum<0){
                    current_sum = 0;
                }
        }
        return maxsum ;
    }
}