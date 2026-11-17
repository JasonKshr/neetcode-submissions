class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        for i in range(0, len(nums), 1):
            nums.append(nums[i])
        return nums;
        