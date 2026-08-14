class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int idx = 0 ;
         helper(ans,nums,idx,current);
         return ans ;
    }
    public void helper(List<List<Integer>> ans,int[] nums,int idx, List<Integer> current){
        int n = nums.length ;
        if(idx == n){ 
            ans.add(new ArrayList<>(current));
            return ;
        }
        // pick karna
        current.add(nums[idx]);
        helper(ans,nums,idx+1,current);
        //skip karna
        current.remove(current.size() - 1);
        helper(ans,nums,idx+1,current);
    }
}