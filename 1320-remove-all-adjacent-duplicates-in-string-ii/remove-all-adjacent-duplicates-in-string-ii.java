class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        for(char c : s.toCharArray()){
            int len = sb.length();
            if(len>0 && sb.charAt(len-1)==c){
                st.push(st.pop()+1);
            }else{
                st.push(1);
            }
            sb.append(c);
            if(st.peek()==k){
                sb.delete(sb.length()-k,sb.length());
                st.pop();
            }
        }
        return sb.toString();
        
    }
}