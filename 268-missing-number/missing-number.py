class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        actual_sum = sum(nums)
        expected_sum = ((len(nums)+1)*len(nums))/2

        return int(expected_sum - actual_sum)