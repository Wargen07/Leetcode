class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1 ;
        while(i<=j){
            char ch = s.charAt(i), ch2 = s.charAt(j) ;
            if(Character.isLetterOrDigit(ch) && Character.isLetterOrDigit(ch2)){
                if(Character.toLowerCase(ch) == Character.toLowerCase(ch2)){
                    i++ ;
                    j-- ;
                }
                else return false ;
            }
            if(!Character.isLetterOrDigit(ch)) i++ ;
            if(!Character.isLetterOrDigit(ch2)) j-- ;
    }
    return true ;
}
}