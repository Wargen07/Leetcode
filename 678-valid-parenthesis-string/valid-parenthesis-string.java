class Solution {
    public boolean checkValidString(String s) {
        int low = 0;  // Minimum open brackets possible
        int high = 0; // Maximum open brackets possible
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                low++;
                high++;
            } else if (c == ')') {
                if (low > 0) low--;
                high--;
            } else { // c == '*'
                if (low > 0) low--; // treat '*' as ')'
                high++;             // treat '*' as '('
            }
            
            if (high < 0) {
                return false; // Too many ')'
            }
        }
        
        return low == 0;
    }
}