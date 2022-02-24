package LinkedList.FindIntersectionOfTwoLinkedList;
import java.util.Set;
import java.util.HashSet;

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Better {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();     
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(set.contains(headB))
                return headB;
            headB=headB.next;
        }
        return null;
    }
    public static void main(String[] args) {
        getIntersectionNode(headA, headB)
    }
    
}