class Solution(object):
    def longestConsecutive(self, nums):
        if not nums:
            return 0
            
        dict1 = sorted(nums)
        temp_count = 1
        max_count = 1
        
        for i in range(len(dict1) - 1):
            
            if dict1[i] == dict1[i+1]:
                continue
            
            if dict1[i] + 1 == dict1[i+1]:
                temp_count += 1
            else:
                temp_count = 1
                
            max_count = max(max_count, temp_count)
            
        return max_count