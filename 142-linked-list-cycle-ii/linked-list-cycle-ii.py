# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        checked = set()
        loop_node = None

        if head is None:
            return None

        curr = head
        while(curr.next is not None):
            if curr.next in checked:
                loop_node = curr.next
                break
            
            checked.add(curr)
            curr = curr.next
        return loop_node
