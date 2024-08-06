package foo;




public class AddTwoNumber {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head = new ListNode();
        ListNode cur = dummy_head;
        int carry = 0;

        while (l1 != null || l2 != null){
            if (l1.val + l2.val + carry >= 10){
                carry = 1;
                cur.val = l1.val + l2.val + carry - 10;
            }else{
                carry = 0;
            }
            cur = cur.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null){
            cur.val = l1.val;
            cur = cur.next;
            l1 = l1.next;
        }

        while (l2 != null){
            cur.val = l2.val;
            cur = cur.next;
            l1 = l1.next;
        }

        return dummy_head.next;
    }
}
