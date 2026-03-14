class Solution {
    class Pair{
        int i;
        int j;
        int t;
        Pair(int i,int j,int t){
            this.i=i;
            this.j=j;
            this.t=t;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }
            }
        }
        int ans=0;
        while(q.size()>0){
            Pair rem = q.remove();
            int row=rem.i;
            int col=rem.j;
            int time=rem.t;
            
            ans=time;

            if(row-1>=0&&grid[row-1][col]==1){
                q.add(new Pair(row-1,col,time+1));
                grid[row-1][col]=2;
            }
            if(col+1<m&&grid[row][col+1]==1){
                q.add(new Pair(row,col+1,time+1));
                grid[row][col+1]=2;
            }
            if(row+1<n&&grid[row+1][col]==1){
                q.add(new Pair(row+1,col,time+1));
                grid[row+1][col]=2;
            }
            if(col-1>=0&&grid[row][col-1]==1){
                q.add(new Pair(row,col-1,time+1));
                grid[row][col-1]=2;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }

        return ans;


        
    }
}