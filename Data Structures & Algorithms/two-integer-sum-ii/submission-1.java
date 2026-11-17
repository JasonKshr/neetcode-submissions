class Solution {
    public int[] twoSum(int[] nums, int target) {

        if(nums.length == 1) return new int[nums[0]];

        int left = 0;
        int right = nums.length-1;

        while(left < right){
            if(nums[left] + nums[right] == target && nums[left] != nums[right]){
                return new int[]{left + 1, right + 1};
            }
            if(nums[left] + nums[right] > target){
                right--;
                continue;
            }
            left++;
        }
        return new int[]{};
    }
}
