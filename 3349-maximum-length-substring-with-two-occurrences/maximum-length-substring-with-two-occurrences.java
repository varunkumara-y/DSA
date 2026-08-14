class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLen=0;
        int left=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] st = s.toCharArray();
        for(int right=0;right<st.length;right++){
            hm.put(st[right],hm.getOrDefault(st[right],0)+1);
            while(hm.get(st[right])>2){
                hm.put(st[left],hm.getOrDefault(st[left],0)-1);
                left++;
            }
                maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}