class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ll = new LinkedList<>();
        int n = nums.length;
        int mid;
        int i;
        int start,end;
        for(i=0;i<n-2;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            if(nums[i]>0) break;
            int target = -nums[i];
            start = i + 1; end = n - 1;
          while(start<end){
              int sum = nums[start]+nums[end];
            if(sum==target) {
                ll.add(Arrays.asList(nums[i],nums[start],nums[end]));
                start++;
                end--;
                while(start<end&&nums[start]==nums[start-1]) start++;
                while(start<end&&nums[end]==nums[end+1]) end--;
            }
            else if(sum<target) start = start + 1;
            else end = end - 1;
        }
             }
        return ll;
    }
}


