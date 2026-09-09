class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <=  1) return 0 ;
        int left = 0 ;
        int mult = 1 ;
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            mult *= nums[i];

            while (mult >= k){
                mult /= nums[left];
                left++ ;
            }
            count += i - left + 1 ;
        }
        return count ;
    }
}