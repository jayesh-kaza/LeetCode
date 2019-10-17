class Solution {
    public int maxSubArray(int[] nums)
    {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        int max=0,maxi=nums[0];
        int tmp=0,i,j;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>maxi)
                maxi=nums[i];
            tmp+=nums[i];
            if(tmp<0)
                tmp=0;
            else if(tmp>max)
                max=tmp;
        }
        if(max==0)
            return maxi;
        return max;
    }
}
