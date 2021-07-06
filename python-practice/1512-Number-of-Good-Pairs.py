class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        total = 0
        for j in range(len(nums)):
            for i in range(j):
                if nums[i] == nums[j]:
                    total+=1
        return total