# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        new1= ListNode(0)
        result = new1
        r=0
        while l1 or l2 or r:
            x= l1.val if l1 else 0 
            y= l2.val if l2 else 0
            sum1= x+y+r
            r= sum1//10
            sum1=sum1%10
            result.next=ListNode(sum1)
            result=result.next
            if l1: l1=l1.next
            if l2: l2=l2.next
        return new1.next