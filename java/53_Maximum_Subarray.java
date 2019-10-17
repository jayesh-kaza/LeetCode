class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)
            return 0;
        int ans = nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            res= Math.max(res+nums[i],nums[i]);
            ans = Math.max(ans,res);
        }
        return ans;
    }
}
