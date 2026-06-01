class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0 ;
        if(nums.length == 0) return 0 ;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[k]!= nums[i]){
                    k++ ;
                    nums[k] = nums[i] ;
            }
        }
        return k+1 ;
    }
}