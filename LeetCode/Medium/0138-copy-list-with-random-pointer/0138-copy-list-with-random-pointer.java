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
       Map<Node,Node> oldToNewMap=new HashMap<>();

       Node dummyNode=new Node(0);
       Node current=dummyNode;

        // First pass: Create all nodes and build the next pointers
        // Also populate the mapping from original to copied nodes
        Node currentOriginal=head;
        while(currentOriginal!=null)
        {
            Node newNode=new Node(currentOriginal.val);

            current.next=newNode;
            current=newNode;
            oldToNewMap.put(currentOriginal,newNode);
            currentOriginal=currentOriginal.next;
        }

        currentOriginal=head;
        while(currentOriginal!=null)
        {
            Node copyNode=oldToNewMap.get(currentOriginal);

            copyNode.random=(currentOriginal.random==null)?null : oldToNewMap.get(currentOriginal.random);
            currentOriginal=currentOriginal.next;
        }
        return dummyNode.next;
    }
}