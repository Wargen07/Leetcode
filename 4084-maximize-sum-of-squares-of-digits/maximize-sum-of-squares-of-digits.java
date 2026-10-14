class Solution {
    public String maxSumOfSquares(int num, int sum) {
        
        if (sum > num * 9 || sum < 0) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        while (sum >= 9 && num > 0) {
            sb.append('9');
            sum -= 9;
            num--;
        }
        
        if (num > 0) {
            sb.append(sum);
            num--;
            sum = 0;
        }
        while (num > 0) {
            sb.append('0');
            num--;
        }
        
        return sb.toString();
    }
}
