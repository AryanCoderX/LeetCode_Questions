class Solution {
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1);
        ListNode dummy = temp;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                temp = temp.next;       
                l1 = l1.next;
            } else {
                temp.next = l2;
                temp = temp.next;      
                l2 = l2.next;
            }
        }

        while (l1 != null) {
            temp.next = l1;
            temp = temp.next;            
            l1 = l1.next;
        }

        while (l2 != null) {
            temp.next = l2;
            temp = temp.next;            
            l2 = l2.next;
        }

        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode temp = null;

        for (ListNode l : lists) {
            temp = merge(temp, l);
        }

        return temp;
    }
}