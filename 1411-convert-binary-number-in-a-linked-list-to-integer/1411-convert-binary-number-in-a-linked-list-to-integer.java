/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public String getNum(ListNode head){
        StringBuilder num= new StringBuilder("");

        ListNode temp = head;
        while(temp!=null){
            num.append((char)(temp.val+'0'));
            temp=temp.next;
        }

        return num.toString();
    }
    public int getDecimalValue(ListNode head) {
        
        String num= getNum(head);

        return Integer.parseInt(num, 2);
    }
}