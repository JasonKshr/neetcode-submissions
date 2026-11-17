class Solution {
    public int search(int[] nums, int target) {
        if(target < nums[0] || target > nums[nums.length-1]) return -1;
        return helper(nums, 0, nums.length-1, target);
        
    }

    public int helper(int nums[], int i, int j, int target){
        
        if(j < i || i > j) return -1;
        int mid = (i+j)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return helper(nums, i, mid -1 , target);
        else return helper(nums, mid + 1, j, target);
    }


}
