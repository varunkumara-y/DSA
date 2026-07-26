class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLen=Integer.MIN_VALUE;
        HashSet<Character> hs = new HashSet<>();
        for(int right=0;right<s.length();right++){

            //
            while(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
        }

        return maxLen==Integer.MIN_VALUE? 0 : maxLen;
        
    }
}