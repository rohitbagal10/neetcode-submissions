class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        char[] chrs1 = s.toCharArray();
        char[] chrs2 = t.toCharArray();

        Arrays.sort(chrs1);
        Arrays.sort(chrs2);

        return Arrays.equals(chrs1,chrs2);
        
    }
}
