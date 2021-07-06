class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        total = 0
        for i in nums:
            if len(str(i))%2 == 0:
                total+=1
        return total