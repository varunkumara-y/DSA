class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        for(int i=0;i<haystack.length();i++){
            if(len>haystack.length()){
                return -1;
            }
            String subStr = haystack.substring(i,len);
            if(subStr.equals(needle)){
                return i;
            }
            len++;
        }
        return -1;

    }
}