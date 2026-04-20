/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        //brute 
        Map<ListNode, Integer> linkMap = new HashMap<>();
        ListNode current = head;

        while (current != null) {
            if (linkMap.containsKey(current)) {
                return true;
            }

            linkMap.put(current,current.val);
            current=current.next;
        }

        return false;
    }
}