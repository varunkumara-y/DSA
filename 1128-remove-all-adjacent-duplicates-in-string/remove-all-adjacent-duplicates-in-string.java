class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty()&&st.peek()==c){
                st.pop();
            }else{
                st.push(c);
            }
        }
        int size = st.size();
        char [] arr = new char[size];
        for(int i=size-1;i>=0;i--){
            arr[i]=st.pop();

        }
        return new String(arr);
        
    }
}