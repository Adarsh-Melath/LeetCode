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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // optimal

        if(lists.length==0)return null;
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);

        for(ListNode node:lists){
           if(node!=null){
             pq.offer(node);
           }
        }

        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;

        while(!pq.isEmpty()){
            ListNode node=pq.poll();

            current.next=node;
            current=current.next;

            if(node.next!=null){
                pq.offer(node.next);
            }
        }

        return dummy.next;
    }

    public ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                current.next=list1;
                list1=list1.next;
            }
            else{
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
        }

        current.next=list1!=null?list1:list2;
        return dummy.next;
    }
}