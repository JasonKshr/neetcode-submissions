class Solution {
    public int searchInsert(int[] nums, int target) {
        return helper(nums, 0, nums.length-1, target);
    }

    public int helper(int[] nums, int left, int right, int target){

        if(left > right) return left;
        if(right < left) return right;
        int mid = (left+right)/2;
        if(nums[mid] == target) return mid;
        if(nums[mid] > target) return helper(nums, left, mid -1, target);
        else return helper(nums, mid+1, right, target);
    }
}