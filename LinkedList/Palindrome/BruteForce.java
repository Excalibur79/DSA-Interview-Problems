package LinkedList.Palindrome;
import java.util.Stack;

public class BruteForce {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> reversed = new Stack<>();
        ListNode start = head;
        while(head!=null){
            reversed.push(head);
            head=head.next;
        }
        while(start!=null){
            if(reversed.isEmpty())
                return false;
            ListNode node = reversed.pop();
            if(node.val!=start.val)
                return false;
            start=start.next;
        }
        return true;
    }
}
