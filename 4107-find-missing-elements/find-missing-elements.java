class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        boolean[] contains=new boolean[101];
        List<Integer> ans = new ArrayList<>();
        for(int ele:nums){
            min=Math.min(min,ele);
            max=Math.max(max,ele);
            contains[ele]=true;
        }
        for(int i=min;i<=max;i++){
            if(!contains[i]){
                ans.add(i);
            }
        }
        

        return ans;
    }
}