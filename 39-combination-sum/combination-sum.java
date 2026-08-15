class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int idx = 0 ;
        helper(ans,candidates,target,current,idx);
        return ans ;
    }
    public void helper(List<List<Integer>> ans,int[] candidates, int target,List<Integer> current,int idx){
        int n = candidates.length ;
        if(target == 0){
            ans.add(new ArrayList<>(current));
            return ;
        }
        if(target<0 || idx == n){
            return ;
        }
        current.add(candidates[idx]);
        helper(ans,candidates,target-candidates[idx],current,idx);
        current.remove(current.size() - 1);
        helper(ans,candidates,target,current,idx+1);
    }
}