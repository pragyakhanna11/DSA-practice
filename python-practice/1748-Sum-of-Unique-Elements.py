class Solution(object):
    def sumOfUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = 0
        nums2 = set(nums)
        for i in nums2:
            if nums.count(i) == 1:
                ans = ans + i
        return ans