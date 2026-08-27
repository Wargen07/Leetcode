class Solution {
    public int mySqrt(int x) {
        int start = 1;
       int high = x,store=0 ;
        while(start <= high){
            int mid = start + (high-start)/2;
            if((long)mid*mid <= x) {
                store = mid ;
                start = mid + 1 ;
            } 
            else high = mid - 1 ;
        }
        return store;
    }
}