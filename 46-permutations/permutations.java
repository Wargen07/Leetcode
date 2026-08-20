class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(ans,nums,curr,used);
        return ans ;
    }
    public static void helper(List<List<Integer>> ans, int[] nums,List<Integer> curr, boolean[] used){
        if(curr.size() == nums.length){ 
            ans.add(new ArrayList<>(curr));
            return ;
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(used[i]) continue;
            used[i] = true ;
            curr.add(nums[i]);
            helper(ans,nums, curr,used);
            used[i] = false ;
            curr.remove(curr.size() - 1);
        }

    }
}