class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int idx = 1;
        helper(ans,n,k,idx,curr);
        return ans;
    }
    public void helper(List<List<Integer>> ans, int n, int k, int idx, List<Integer> curr){
        if(curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        for(int i = idx ; i<=n ; i++){
            curr.add(i);
            helper(ans,n,k,i+1,curr);
            curr.remove(curr.size() - 1);
        }
    }
}