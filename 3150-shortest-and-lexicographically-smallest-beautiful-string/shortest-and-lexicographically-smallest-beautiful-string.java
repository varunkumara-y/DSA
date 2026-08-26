class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int ones=0;
        String ans="";
        int minLen=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            if((s.charAt(right))== '1'){
                ones++;
            }
            while(ones==k){
                int len=right-left+1;
                String candidate=s.substring(left,right+1);

                if(len<minLen){
                    minLen=len;
                    ans=candidate;
                }else if(len==minLen && candidate.compareTo(ans)<0){
                    ans=candidate;
                }
                if(s.charAt(left)=='1'){
                    ones--;
                }
                left++;
            }
        }
        return ans;
    }
}