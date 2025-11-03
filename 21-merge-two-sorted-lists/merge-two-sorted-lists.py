# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        curr1= list1
        curr2 = list2  
        dummy= ListNode()
        curr3= dummy
        while curr1 and curr2 :
            if curr1.val < curr2.val:
                curr3.next= curr1
                curr1= curr1.next
            else:
                curr3.next = curr2
                curr2 = curr2.next
            curr3 = curr3.next
        if not (curr1 and curr2):
            while curr1 or curr2:
                if curr1:
                    curr3.next = curr1
                    curr1 = curr1.next
                elif curr2:
                    curr3.next = curr2
                    curr2 = curr2.next
                curr3 = curr3.next

        return dummy.next

        
