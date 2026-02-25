# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseKGroup(self, head, k):
        node = head 
        count = 0 
        while node and count < k:
            node = node.next
            count += 1
        if count < k:
            return head 
        
        # Reverse first k nodes
        prev = None
        curr = head
        for _ in range(k):
            next_temp = curr.next
            curr.next = prev
            prev = curr
            curr = next_temp
        
        # Recursive call for the rest of the list
        head.next = self.reverseKGroup(curr, k)

        return prev