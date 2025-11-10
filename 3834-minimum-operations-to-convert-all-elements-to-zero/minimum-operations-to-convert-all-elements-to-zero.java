class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        Deque<Integer> st = new ArrayDeque<>();
        st.push(0);
        for(int num: nums){
            while(!st.isEmpty() && st.peek() > num){
                st.pop();
            }
            if(num > 0 && (st.isEmpty() || st.peek() < num)){
                ans++;
                st.push(num);
            }
        }
        return ans;
    }
}