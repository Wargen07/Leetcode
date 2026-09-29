class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] res = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {

            for (int j = num2.length() - 1; j >= 0; j--) {

                int digit = (num1.charAt(i) - '0') 
                          * (num2.charAt(j) - '0');

                int pos1 = i + j;
                int pos2 = i + j + 1;

                res[pos2] += digit;

                res[pos1] += res[pos2] / 10;
                res[pos2] %= 10;
            }
        }

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < res.length && res[i] == 0) {
            i++;
        }

        while (i < res.length) {
            ans.append(res[i]);
            i++;
        }

        return ans.toString();
    }
}