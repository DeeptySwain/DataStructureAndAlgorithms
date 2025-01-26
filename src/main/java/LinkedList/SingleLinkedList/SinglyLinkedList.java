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
// Traverse Method for singly LL: TC: O(N), SC: O(N)
    public void traverseSinglyLinkedList() {
        if(head==null){
            System.out.println("No SLL Present.");
        }else {
            Node tempNode = new Node();
            tempNode =head;
            for(int i=0; i<size; i++){
                   System.out.print(tempNode.value);
                   // not required for traverse, just for output look
                   if(i != size-1){
                       System.out.print(" -> ");
                   }
                   tempNode = tempNode.next;
            }
        }
    }
// search the index of a value in a sll return -1 if not present
    public int searchAValue(int searchValue){
        if(head !=null){
//            if(head.value == searchValue){
//                return 0; // as head is always pointed to the first element
//            }
            Node tempNode = new Node();
            tempNode = head;
            for(int i=0; i<size; i++){
                if(tempNode.value == searchValue){
                    return i;
                }else {
                    tempNode = tempNode.next;
                }
            }
        }
        return -1;
    }

    /**
     * For delete an element from SLL
     * @param location
     * @return
     */
    public Node deleteFromSLL(int location) {
        // when there is no node:
        if(head==null){
            System.out.println("No SLL present.");
        } else{
            Node tempNode = head;
            // Delete from first:
            if(location==0){
                // i) if multiple Nodes (more than one element) are present:
                head = head.next;
                size--;
                //ii) if only 1 node is present, that means the after size -- it will become 0:
                if(size==0){
                    tail=null;
                }
            }
            // Delete from Last:
            else if (location >= size-1) {
                // if it is not reached till the previous Node of last node
                while (tempNode.next.next != null){
                    tempNode = tempNode.next;
                }
               // if it is the previous Node of last node then set it to null so that last element connection can be discard.
                tempNode.next=null;
                tail=tempNode;
                size--;
            }
            // Delete from Middle
            else {
                for (int i =0; i<location; i++){
                    tempNode = tempNode.next;
                }
                System.out.println("deleting successfully" + tempNode.next.value);
                // when temp node reached the previous node of given  location
                tempNode.next = tempNode.next.next;
                size--;
            }
        }
        return head;
    }

}
