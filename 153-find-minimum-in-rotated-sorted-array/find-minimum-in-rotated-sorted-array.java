class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int high = nums.length - 1;

        while (start < high){
            int mid = start + (high - start)/2 ;
            if(nums[mid] > nums[high]){
                start = mid + 1;
            }
            else high = mid;
        }
        return nums[start] ;
    }
}