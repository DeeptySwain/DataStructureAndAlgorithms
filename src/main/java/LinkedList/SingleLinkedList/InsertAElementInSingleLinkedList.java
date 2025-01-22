package LinkedList.SingleLinkedList;
//TC: O(N) SC: O(N)
public class InsertAElementInSingleLinkedList {
    // Calling Create Single LinkedList method to get the head, tail size etc
    CreateSingleLinkedList create = new CreateSingleLinkedList();
    Node head = create.head;
    Node tail = create.tail;
    int size = create.size;

    public Node insertIntoSingleLL(int insertValue, int location){

        // when head refer to null means no node is there and one node we are adding = similar to what we did in createSingleLinkedList
        // , newNode.next = null, newNode.value = insertValue, head=newNode, tail=newNode;
        if(head == null){
            return  create.createASingleLinkedList(insertValue);
        }
        // create the new Node in memory which needs to be inserted:
        Node newNode = new Node();
        newNode.value = insertValue;

        // at the beginning of linked list
        if(location==0){
        newNode.next = head;
        head = newNode;
        }
        // in the  end of single ll
        else if(location>=size){
             newNode.next=null;
            tail.next=newNode;
             tail=newNode;
        }else {
            // creating a temp node to track current node position
            Node tempNode = head;
            int index =0;
            while (index < location-1){
                tempNode=tempNode.next;
                index++;
            }
           // creating the next node to get hold of node which is currently at the position of "location"
            Node nextNode = tempNode.next;
            // making current node reference to newly inserted node hence the link to nextNode position break for tempNode and it holds nextNode reference.
            tempNode.next = newNode;
            newNode.next = nextNode;
        }
        size++;
        return head;
    }
}
