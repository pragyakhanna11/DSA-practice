class Solution(object):
    def remove_values_from_list(the_list, val):
        return [value for value in the_list if value != val]
    def findLucky(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        lucky = []
        for num in arr:
            counter = 0
            for i in range(len(arr)):
                if arr[i]==num:
                    counter+=1
            if counter==num:
                lucky.append(num)
        if lucky==[]:
            return -1
        else:
            return max(lucky)