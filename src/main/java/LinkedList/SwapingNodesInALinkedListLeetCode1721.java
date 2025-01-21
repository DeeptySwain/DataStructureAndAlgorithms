package LinkedList;

import java.util.LinkedList;

public class SwapingNodesInALinkedListLeetCode1721 {

    // main method:
    public static void main(String[] args){
        SwapingNodesInALinkedListLeetCode1721 swap = new SwapingNodesInALinkedListLeetCode1721();
        LinkedList myList = new LinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);


       // swapNodes();
    }


    /**
     * Definition for singly-linked list.**/
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
         ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public ListNode swapNodes(ListNode head, int k) {
        ListNode p = head;
        ListNode q = head;
        int index = k;
        // to shift q to kth index;
        while(index > 0){
            q= q.next;
            index--;
        }
        ListNode kthNodeFromBegin = q;
        while(q != null){
            p= p.next;
            q= q.next;
        }

        //  kthNodeFromEnd = p;
        int temp = kthNodeFromBegin.val;
        kthNodeFromBegin.val = p.val;
        p.val = temp;

        return head;
    }
}
