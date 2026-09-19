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
    public ListNode head(ListNode head, int a){
        ListNode temp= head; 
        for(int i=0; i<a; i++){
            temp=temp.next;
        }
        return temp;
    }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode h2= head(list1, b);

        ListNode temp= list1;
        int idx=1;
        while(temp!=null){
            if(idx==a){
                temp.next=list2;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=h2.next;
                break;
            }
            idx++;
            temp=temp.next;
        }
        return list1;
    }
}