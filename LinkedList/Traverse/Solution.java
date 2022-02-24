package LinkedList.Traverse;

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    public static ListNode head;
    public static ListNode start;

    public static void createList(int arr[]){
        head = new ListNode(arr[0]);
        start = head;
        for(int i=1;i<arr.length;i++){
            ListNode newNode = new ListNode(arr[i]);
            head.next = newNode;
            head = newNode;
        }
    }

    public static void traverseList(ListNode head){
        while(head!=null){
            System.out.println(head.val+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        createList(new int[]{1,2,3});
        traverseList(start);
    }
    
}