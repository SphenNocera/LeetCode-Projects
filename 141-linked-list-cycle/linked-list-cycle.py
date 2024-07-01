# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        checked = set()
        loop = False

        if head is None:
            return False

        curr = head
        while(curr.next is not None):
            checked.add(curr)

            if curr.next in checked:
                loop = True
                break
            
            curr = curr.next
        
        return loop
            