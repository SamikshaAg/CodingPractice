
package mycodeschool;
import mycodeschool.Node;

public class InorderPredecessor {
    public static void main(String[] args)throws Exception
    {
    Node root=null;
    root=Insert(root,5);
    root=Insert(root,10);
    root=Insert(root,3);
    root=Insert(root,4);
    root=Insert(root,1);
    root=Insert(root,11);
    
   // Inorder(root);
    Node res=InorderPredecessor(root,11);
    if(res==null)
        System.out.print("No predecessor found");
    else
            System.err.print(res.data);
    }

    private static Node Insert(Node root, int val) {
        if(root==null)
        {
        root=new Node(val);
        root.data=val;
        root.left=root.right=null;
        }
        else if(val < root.data)
            root.left=Insert(root.left, val);
        else
            root.right=Insert(root.right, val);
        return root;
    }

  /*  private static void Inorder(Node root) {
        if(root==null)
            return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }*/

    private static Node InorderPredecessor(Node root, int val) {
        Node current=FindCurrent(root,val);
        if(current==null)
            return null;
        if(current.left!=null)
            return FindMax(current.left);
        else
        {
        Node predecessor=null;
        Node ancestor=root;
        while(current!=ancestor)
        {
        if(current.data > ancestor.data)
        {
        predecessor=ancestor;
        ancestor=ancestor.right;
        }
        else
            ancestor=ancestor.left;
        }
        return predecessor;
        }
    }

    private static Node FindCurrent(Node root, int val) {
       if(root==null)
           return null;
       else if(val == root.data)
           return root;
       else if(val < root.data)
           return FindCurrent(root.left, val);
       else
           return FindCurrent(root.right, val);
    }

    private static Node FindMax(Node curr) {
       if(curr==null)
           return null;
       while(curr.right!=null)
           curr=curr.right;
       return curr;
    }
}
