package LinkedList.SingleLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert Method SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = newNode;
            newNode.next = nextNode;
        }
        size++;
    }

    public void traverseSinglyLinkedList() {
    }

    public void deleteSLL() {
    }
}
