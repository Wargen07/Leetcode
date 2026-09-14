class Solution {
    public int minBitFlips(int start, int goal) {
        int result = start ^ goal ;
        int count = 0 ;
        for(int i = 0 ; i < 32 ; i++){
            count += (result & 1);
            result >>= 1 ;
        }
        return count ;
    }
}