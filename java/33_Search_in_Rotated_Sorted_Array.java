class Solution {
    public int search(int[] nums, int target) {
        return customBinarySearch(nums, 0, nums.length-1, target);
    }

    public int customBinarySearch(int[] nums, int low, int high, int target) {
        if (low > high) return -1;
        int middle = (low + high)/2;
        if (nums[middle] == target) return middle;
        if (nums[low] <= nums[middle]) {
            if (target >= nums[low] && target <= nums[middle]) {
                return customBinarySearch(nums, low,middle-1, target);
            }
            return customBinarySearch(nums, middle+1, high, target);
        }
        if (target >= nums[middle] && target <= nums[high]) {
            return customBinarySearch(nums, middle+1, high, target);
        }
        return customBinarySearch(nums, low, middle-1, target);
    }
}