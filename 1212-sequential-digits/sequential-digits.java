class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> ans = new ArrayList<>();

        int minLen = String.valueOf(low).length();
        int maxLen = String.valueOf(high).length();

        for(int i=minLen;i<=maxLen;i++){
            for(int start=0; start+i<=9;start++){
                int num = Integer.parseInt(digits.substring(start,start+i));

                if(num>=low && num<=high){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}