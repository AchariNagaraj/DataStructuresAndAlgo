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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode prev=null;
        ListNode head=null;
        int carry=0;

        while(temp1!=null && temp2!=null){
            int addition=carry+temp1.val+temp2.val;
            ListNode temp=new ListNode();
            if(head==null) head=temp;
            temp.val=addition%10;
            if(addition/10==1){
                carry=1;
            }
            else{
                carry=0;
            } 
            if(prev!=null) prev.next=temp;
            prev=temp;  
            temp1=temp1.next;
            temp2=temp2.next;
        }

        while(temp1!=null){
            ListNode temp=new ListNode();
            int addition=carry+temp1.val;
            temp.val=addition%10;
            if(addition/10==1){
                carry=1;
            }
            else{
                carry=0;
            }
            prev.next=temp;//linking
            prev=temp;
            temp1=temp1.next;
        }
        
        while(temp2!=null){
            ListNode temp=new ListNode();
            int addition=carry+temp2.val;
            temp.val=addition%10;
            if(addition/10==1){
                carry=1;
            }
            else{
                carry=0;
            }
            prev.next=temp;
            prev=temp;
            temp2=temp2.next;
        }
        if(carry==1){
            ListNode temp=new ListNode();
            temp.val=1;
            prev.next=temp;
        }
        return head;

    }
}