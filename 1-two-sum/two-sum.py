class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)-1):
           seen={}
           for i,num in enumerate(nums):
            if target-num in seen:
                return(seen[target-num],i)
            elif num not in seen:
                seen[num]=i