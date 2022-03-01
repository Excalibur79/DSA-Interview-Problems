package LinkedList.FlattenLinkedList;

class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}

public class Optimal
{
    Node mergeTwoLists(Node a, Node b) {
        
        Node temp = new Node(0);
        Node res = temp; 
        
        while(a != null && b != null) {
            if(a.data < b.data) {
                temp.bottom = a; 
                temp = temp.bottom; 
                a = a.bottom; 
            }
            else {
                temp.bottom = b;
                temp = temp.bottom; 
                b = b.bottom; 
            }
        }
        
        if(a != null) temp.bottom = a; 
        else temp.bottom = b;
        return res.bottom; 
    
    }
    Node flatten(Node root)
    {
       
            if (root == null || root.next == null) 
                return root; 
      
            // recur for list on right 
            root.next = flatten(root.next); 
      
            // now merge 
            root = mergeTwoLists(root, root.next); 
      
            // return the root 
            // it will be in turn merged with its left 
            return root; 
    }
}