
package mycodeschool;

class Node
{
int data;
Node left,right;
Node(int data)
{
this.data=data;
left=right=null;
}
}

public class InorderSuccessor {
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
    Node res=InorderSuccessor(root,11);
    if(res==null)
        System.out.print("NO");
    else
    System.out.print(res.data);
    }

    private static Node Insert(Node root, int val) {
        if(root==null)
        {
         root=new Node(val);   
         root.data=val;
         root.left=root.right=null;
        }
        else
        {
        if(val < root.data)
            root.left=Insert(root.left, val);
        else
            root.right=Insert(root.right, val);
        }
        return root;
    }

  /*  public static void Inorder(Node root) {
        if(root==null)
            return;
        
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
        
    }*/

    public static Node InorderSuccessor(Node root, int i) {
        Node current= Find(root,i);
        if(current==null)
            return null;
        //Case 1
        if(current.right!=null)
        return FindMin(current.right);
    
        //Case 2
        else
        {
        Node successor=null;
        Node ancestor=root;
        while(current!=ancestor)
        {
        if(current.data < ancestor.data)
        {
        successor=ancestor;
        ancestor=ancestor.left;
        }
        else
            ancestor=ancestor.right;
        }
        return successor;
        }
    }

    public static Node Find(Node root, int i) {
        if(root==null)
            return null;
        else if(i==root.data)
            return root;
        else if(i<root.data)
             return Find(root.left,i);
        else
            return Find(root.right,i);
        
    }

    public static Node FindMin(Node curr) {
        if(curr==null)
            return null;
        else
        {
        while(curr.left!=null)
            curr=curr.left;
        return curr;
        }
    }
}
