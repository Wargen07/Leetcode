class Solution {
    public boolean isAnagram(String s, String t) {
        char[] result = s.toCharArray() ;
        char[] ames = t.toCharArray() ;
        Arrays.sort(result);
        Arrays.sort(ames);
         String a = new String(result);
         String m = new String(ames);
         return a.equals(m);  
    }
}