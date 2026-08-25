class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i =1; ; i++){
            int mul = k*i ;
            boolean a = false ;
            for(int j =0 ; j<nums.length ; j++){
                if(nums[j] == mul) a = true ; 
            }
            if(!a) return mul ;
        }
        
    }
}