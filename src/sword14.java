public class sword14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode pre = head;
        int num =0;
        if (head == null)return null;
        while (pre.next != null){
            pre = pre;
            num++;
        }

        if (k > num +1 )return null;
        for (int i = 0; i < num - k +1; i++) {
            head = head.next;
        }
        return head;

    }
}


