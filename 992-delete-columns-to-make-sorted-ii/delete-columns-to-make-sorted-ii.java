class Solution {
    public int minDeletionSize(String[] strs) {
        int rows=strs.length;
        int cols=strs[0].length();

        boolean[] sorted = new boolean[rows-1];
        int ans=0;

        outer:
        for(int col=0;col<cols;col++){
            for(int row=0;row<rows-1;row++){
                if(!sorted[row]&&strs[row].charAt(col)>strs[row+1].charAt(col)){
                    ans++;
                    continue outer;

                }
            }
            for(int i=0;i<rows-1;i++){
                if(!sorted[i]&&strs[i].charAt(col)<strs[i+1].charAt(col)){
                    sorted[i]=true;
                }
            }
        }
        return ans;
        
    }
}