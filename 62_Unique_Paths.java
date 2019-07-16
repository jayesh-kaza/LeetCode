class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] =  new int[n][m];
        for(int i=0;i<m;i++)
            dp[0][i] = 1;
        for(int j=0;j<n;j++)
            dp[j][0] = 1;
        for(int i=1;i<n;i++)
            for(int j=1;j<m;j++)
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
        return dp[n-1][m-1];
    }
}
