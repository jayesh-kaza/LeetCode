class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int ans[][] = new int[A.length][A[0].length];
        
        for(int i=0;i<A.length;i++)
            for(int j=A[0].length-1,k=0;j>=0&&k<A[0].length;j--,k++)
                ans[i][k] = A[i][j]==1?0:1;
        return ans;
    }
}
