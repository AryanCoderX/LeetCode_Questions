/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hm= new HashSet<>();

        for(ListNode temp=headA; temp!=null; temp=temp.next){
            hm.add(temp);
        }

        ListNode temp= headB;
        while(temp!=null && !hm.contains(temp)){
            temp=temp.next;
        }


        return (temp==null)?null:temp;
    }
}