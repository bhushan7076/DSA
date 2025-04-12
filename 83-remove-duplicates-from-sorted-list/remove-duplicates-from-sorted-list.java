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
    public ListNode deleteDuplicates(ListNode head) {

       
        ListNode temp=head;
         if(temp==null){
            return temp;
        }
        ListNode temp1=head.next;

       

        while(temp1!=null){
            if(temp1.val==temp.val){
                temp.next=temp1.next;
                temp1.next=null;
                temp1=temp.next;
            }else{
                temp=temp.next;
                temp1=temp1.next;
            }
        }
        return temp=head;
    }
}