public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode node = head;
        ListNode cur = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        if (count < k) {
            return null;
        } 
        for (int i = 0; i<count - k; i++) {
            cur = cur.next;
        } 
        return cur;
    }
}