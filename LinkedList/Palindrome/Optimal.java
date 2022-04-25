package LinkedList.Palindrome;


class ListNode{
    int val;
    ListNode next;
    ListNode(){
        this.val=0;
        this.next=null;
    }
    ListNode(int val){
        this.val=val;
        this.next = null;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class Optimal {
    ListNode list;

    public static ListNode createList(int arr[]){       
        ListNode tailing = new ListNode(arr[0]);
        ListNode head = tailing;
        for(int i=1;i<arr.length;i++){
            ListNode newNode = new ListNode(arr[i]);
            tailing.next = newNode;
            tailing = newNode;
        }
        return head;
    }

    public static void printList(ListNode head){
        while(head!=null){
            System.out.println(head.val+" ");
            head=head.next;
        }
    }

    //considers the first of the two middle nodes in an even sized linked list
    public static ListNode findMiddle(ListNode head){
        ListNode slow = head,fast = head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static ListNode reverseList(ListNode head){
        ListNode newNode = null;       
        while(head!=null){
            ListNode nextNode = head.next;
            head.next = newNode;
            newNode = head;
            head = nextNode;
        }
        return newNode;
    }

    public static boolean checkPalindrome(ListNode p1,ListNode p2){
        while(p2!=null){
            if(p1.val!=p2.val)
                return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1};
        ListNode head =  createList(arr);
        ListNode middleNode = findMiddle(head);
        //System.out.println("sss"+middleNode.val);
        ListNode lastNode = reverseList(middleNode.next);
        middleNode.next = lastNode;
        boolean ans = checkPalindrome(head,middleNode.next);
        System.out.println(ans);
       // printList(head);
    }
}
