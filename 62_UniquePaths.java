class Solution {
    public int uniquePaths(int cols, int rows)
    {
        int dp[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
            dp[i][0]=1;
        for(int i=0;i<cols;i++)
            dp[0][i]=1;
        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<cols;j++)
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
        }
        return dp[rows-1][cols-1];
    }
}

