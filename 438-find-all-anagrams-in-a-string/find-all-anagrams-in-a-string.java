class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int k = p.length();

        int[] pFreq = new int[26];
        int[] winFreq = new int[26];

        for (int i = 0; i < k; i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < k; i++) {
            winFreq[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pFreq, winFreq)) {
            ans.add(0);
        }

        for (int i = k; i < s.length(); i++) {

            winFreq[s.charAt(i - k) - 'a']--;

            winFreq[s.charAt(i) - 'a']++;

            if (Arrays.equals(pFreq, winFreq)) {
                ans.add(i - k + 1);
            }
        }

        return ans;
    }
}