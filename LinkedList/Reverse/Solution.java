package LinkedList.Reverse;

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution{
    public static  ListNode reverseList(ListNode head){
        ListNode newNode = null;
        while(head!=null){
            ListNode nextNode = head.next;
            head.next=newNode;
            head=nextNode;
            newNode = head;
        }
        return newNode;
        
    }
    public static void main(String[] args) {
        
    }
}