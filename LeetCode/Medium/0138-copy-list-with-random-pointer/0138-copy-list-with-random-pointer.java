/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> oldToNew = new HashMap<>();

        Node dummy = new Node(0);
        Node current = dummy;

        // Pass 1
        Node currentOriginal = head;
        while (currentOriginal != null) {
            Node copiedNode = new Node(currentOriginal.val);

            current.next = copiedNode;
            current = copiedNode;

            //store it in map
            oldToNew.put(currentOriginal, copiedNode);
            currentOriginal = currentOriginal.next;
        }

        //Pass 2
        currentOriginal=head;
        while(currentOriginal!=null)
        {
            Node copiedNode=oldToNew.get(currentOriginal);

            copiedNode.random=(currentOriginal.random==null)?null:oldToNew.get(currentOriginal.random);
            currentOriginal=currentOriginal.next;
        }

        return dummy.next;
    }
}