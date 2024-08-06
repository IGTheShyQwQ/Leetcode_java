package foo;

public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;


        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;
        ListNode cur = dummy_head;

        while(cur.next != null){
            ListNode next = 
        }
    }
}
