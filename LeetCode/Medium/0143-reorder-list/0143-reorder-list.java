/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public void reorder(ListNode head)
    {
        if(head==null || head.next==null) return;

        //find middle
        ListNode slow=head;
        ListNode fast=fast;

        while(fast.next!=null  && fast.next.next)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse
        ListNode second=reverse(slow.next);
        slow.next=null;

        //merge
        ListNode first=head;

        while(second!=null)
        {
            ListNode temp1=first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }
    }

    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

    //     // STEP 2: Reverse second half
    //     ListNode second = reverse(slow.next);
    //     slow.next = null; // cut the list

    //     // STEP 3: Merge
    //     ListNode first = head;

    //     while (second != null) {
    //         ListNode temp1 = first.next;
    //         ListNode temp2 = second.next;

    //         first.next = second;
    //         second.next = temp1;

    //         first = temp1;
    //         second = temp2;
    //     }
    // }
}