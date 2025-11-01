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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> vtr = new HashSet<>();
        for(int num:nums){
            vtr.add(num);
        }
        while(head!=null&&vtr.contains(head.val)){
            head=head.next;
        }
        if(head==null){
            return null;
        }
        ListNode cur = head;
        while(cur.next!=null){
            if(vtr.contains(cur.next.val)){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
        return head;
    }
}