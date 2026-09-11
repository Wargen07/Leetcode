class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans = new ArrayList<>();
        if(s.length() == 0 || s == null) return ans ;
        int[] freq = new int[26];
        for(char c : p.toCharArray()){
            freq[c-'a']++;
        }
        int left = 0 ;
        int right = 0;
        int count = p.length();

        while ( right < s.length()){
            if(freq[s.charAt(right++) - 'a']-- >= 1) count-- ;

            if(count == 0 ) ans.add(left);

            if(right - left == p.length() && freq[s.charAt(left++)-'a']++ >= 0) count++;
        }
        return ans ;
    }
}