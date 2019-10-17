class Solution {
    public int heightChecker(int[] heights) {
        int temp[] = new int[heights.length];
        for(int i=0;i<temp.length;i++)
            temp[i]=heights[i];
        Arrays.sort(temp);
        int ans=0;
        for(int i=0;i<temp.length;i++)
            if(temp[i]!=heights[i])
                ans+=1;
        return ans;
    }
}
