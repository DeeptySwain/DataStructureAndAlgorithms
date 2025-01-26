package LinkedList.SingleLinkedList;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
       //System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 0);
       System.out.println(sLL.head.next.next.next.value);
        sLL.traverseSinglyLinkedList();
        System.out.println("\n");
        sLL.deleteFromSLL(2);
        sLL.traverseSinglyLinkedList();
        System.out.println("\n");
        System.out.println(sLL.searchAValue(7));
    }
}
