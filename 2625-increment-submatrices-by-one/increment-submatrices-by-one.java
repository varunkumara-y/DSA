class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int [][] diff = new int[n+1][n+1];

        //mark diff matrix
        for(int[] q:queries){
            int r1=q[0];
            int c1=q[1];
            int r2=q[2];
            int c2=q[3];

            diff[r1][c1]+=1;
            diff[r1][c2+1]-=1;
            diff[r2+1][c1]-=1;
            diff[r2+1][c2+1]+=1;
        }

        //prefix sum row-wise
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                diff[i][j]+=diff[i][j-1];
            }
        }
        
        //prefix sum column-wise
        for(int j=0;j<n;j++){
            for(int i=1;i<n;i++){
                diff[i][j]+=diff[i-1][j];
            }
        }

        //build final matrix
        int [][] res = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j]=diff[i][j];
            }
        }
        return res;
    }
}