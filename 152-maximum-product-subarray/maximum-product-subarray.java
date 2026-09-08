class Solution {
    public int maxProduct(int[] nums) {
        int maxmul = nums[0];
        int minmul = nums[0];
        int ans = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            int x = nums[i] ;
            int tempmax = Math.max(x, Math.max(x*maxmul , x*minmul));
            int tempmin = Math.min(x,Math.min(x*maxmul,x*minmul));
             
            maxmul = tempmax ;
            minmul = tempmin ;
            ans = Math.max(ans, maxmul); 
        }
        return ans ;
    }
}