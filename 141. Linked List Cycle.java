/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null){
            s = s.next;     //1x speed movement
            f = f.next.next;    //2x speed movement
            if(s == f){
                return true;
            }
        }
        return false;
    }
}
