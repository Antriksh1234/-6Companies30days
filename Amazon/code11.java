package Amazon;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class code11 {
     //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    Node head = root;
	    fillWithPreOrder(head, A);
	}
	
	public void fillWithPreOrder(Node root, ArrayList<Integer> list) {
	    if (root == null) {
	        return;
	    }
	    
	    fillWithPreOrder(root.left, list);
	    list.add(root.data);
	    fillWithPreOrder(root.right, list);
	}
	
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        Node root = null;
        if (A.size() == 0) {
            return root;
        }
        
        root = createTreeUtil(root, A, 0, A.size()-1);
        return root;
    }
    
    public Node createTreeUtil(Node root, ArrayList<Integer> A, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        int ele = A.get(mid);
        root = new Node(ele);
        root.left = createTreeUtil(root.left, A, low, mid-1);
        root.right = createTreeUtil(root.right, A, mid + 1, high);
        return root;
    }
}
