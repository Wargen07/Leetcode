class Solution {
    public void reverseString(char[] s) {
        int first = 0 ;
        int second = s.length - 1 ;
        char temp ;
            for (int i = 0 ; i < s.length ; i++){
            if(first < second){
                temp = s[first] ;
                s[first] = s[second] ;
                s[second] = temp ;
                first ++ ;
                second -- ;
            }
        }
    }
}