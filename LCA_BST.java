
package mycodeschool;
import mycodeschool.Node;

public class LCA_BST {
    public static void main(String[] args)throws Exception
    {
    Node root=new Node(20);
    root.left=new Node(8);
    root.right=new Node(22);
    root.left.left=new Node(4);
    root.left.right=new Node(12);
    root.left.right.left=new Node(10);
    root.left.right.right=new Node(14);
    int n1=10;
    int n2=22;
    Node res=LCA(root,n1,n2);
    if(res==null)
        System.out.print("NO LCA");
    else
        System.out.print(res.data);
    }

    private static Node LCA(Node root, int n1, int n2) {
        //Recursion
       /* if(root==null)
            return null;
        if(root.data> n1 && root.data > n2)
            return LCA(root.left, n1, n2);
        if(root.data < n1 && root.data < n2)
            return LCA(root.right, n1, n2);*/
        
        //Iteration
        while(root!=null)
        {
        if(root.data > n1 && root.data > n2)
            root=root.left;
        else if(root.data < n1 && root.data < n2)
            root=root.right;
        else
            break;
        }
        return root;
    }
}
