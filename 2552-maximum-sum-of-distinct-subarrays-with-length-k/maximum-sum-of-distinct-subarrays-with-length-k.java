class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max_sum = 0 ;
        long curr_sum = 0 ;
        int[] freq = new int[100001] ;
        int distinct = 0 ;
        int n = nums.length ;
        for(int i = 0 ; i < k ; i++){
            curr_sum += nums[i] ;

            if(freq[nums[i]] == 0) distinct++ ;
            freq[nums[i]]++ ;
        }
        if(distinct == k ) max_sum = curr_sum ;

        for(int i = 0 ; i<n-k ;i++){
            int remove = nums[i] ;
            curr_sum -= remove;
            freq[remove]-- ;
            if(freq[remove] == 0) distinct-- ;

            int add = nums[i+k];
            curr_sum += add ;
            if(freq[add] == 0) distinct++ ;
            freq[add]++ ;

            if(distinct == k) {
                max_sum = Math.max(max_sum,curr_sum);
            }
        }
        return max_sum ;
    }
}