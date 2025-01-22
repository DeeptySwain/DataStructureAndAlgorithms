package LinkedList.SingleLinkedList;

public class CreateSingleLinkedList {
    public Node head;
    public Node tail;
    public int size;
// TC: O(1) SC: O(1)
    public Node createASingleLinkedList(int nodeValue){
        head = new Node();
        tail = new Node();
        Node node = new Node();
        node.value = nodeValue; // assign value
        node.next = null; // assign reference
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}
