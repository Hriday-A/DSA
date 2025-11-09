
# # Definition for a Node.
# class Node:
#     def __init__(self, x, next=None, random=None):
#         self.val = int(x)
#         self.next = next
#         self.random = random


class Solution(object):
    def copyRandomList(self, head):
        """
        :type head: Node
        :rtype: Node
        """
        new_copy={None:None}

        curr= head 
        while curr:
            copy = Node(curr.val)
            new_copy[curr]=copy 
            curr= curr.next 
        
        curr=head 
        while curr:
            copy=new_copy[curr]
            copy.next=new_copy.get(curr.next)
            copy.random=new_copy.get(curr.random)
            curr=curr.next 

        return new_copy[head]
        