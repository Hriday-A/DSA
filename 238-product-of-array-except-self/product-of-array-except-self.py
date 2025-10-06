class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        dict1=[]
        prod=1
        count=0
        for i in nums:
            if i!=0:
                prod*=i
            else:
                count+=1
        for i in nums:
            if count==1:
                if i==0:
                    dict1.append(prod)
                else:
                    dict1.append(0)
            elif count>=2:
                dict1.append(0)
            else:
                dict1.append(prod/i)
        return dict1

