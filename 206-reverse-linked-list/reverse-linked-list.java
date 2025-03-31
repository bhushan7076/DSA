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
    public ListNode reverseList(ListNode head) {
        ListNode first=null;
        ListNode second=head;
        ListNode third=null;

        while(second!=null){
            first=second.next;
            second.next=third;
            third=second;
            second=first;
        }

        return third;

    }
}