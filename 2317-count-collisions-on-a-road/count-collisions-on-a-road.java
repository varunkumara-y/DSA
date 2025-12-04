class Solution {
    public int countCollisions(String directions) {
        char [] dir = directions.toCharArray();
        int n = dir.length;
        int left=0;
        int right=n-1;

        while(left<n&&dir[left]=='L'){
            left++;
        }
        while(right>=0&&dir[right]=='R'){
            right--;
        }

        int ans = 0;
        for(int i=left;i<=right;i++){
            if(dir[i]!='S'){
                ans++;
            }

        }
        return ans;
    }
}