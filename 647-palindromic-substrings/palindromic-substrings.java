class Solution {
    public static int expand(String s,int left,int right){
        int count=0;
        while(left>=0 &&right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        if(s.length()<=1){
            return 1;
        }
        int count=0;
        for(int i=0;i<s.length();i++){
        count+=expand(s,i,i);
        count+=expand(s,i-1,i);
        }
        return count;
    }
}