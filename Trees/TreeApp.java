import java.util.List;
import java.util.ArrayList;
import java.util.Stack; // its a class 


public class TreeApp{

    public static<E> void traverseInorder(TreeNode<E> root){
	if (root == null) return;
	traverseInorder(root.getLeft());
	System.out.print(root.getValue() + " ");
	traverseInorder(root.getRight());

    }
    public static<E> void traversePreorder(TreeNode<E> root){
	if (root == null) return;
	System.out.print(root.getValue() + " ");	
	traversePreorder(root.getLeft());
	traversePreorder(root.getRight());
    }
    public static<E> void traversePostorder(TreeNode<E> root){
	if (root == null) return;
	traversePostorder(root.getLeft());
	traversePostorder(root.getRight());
	System.out.print(root.getValue() + " ");
    }
    
    // ********** Question 2 *********************************
    // Recursively process the tree to count the nodes.
    // postcondition: returns the number of nodes in the tree.

    public static<E> int countNodes(TreeNode<E> rt){
	if (rt == null) return 0;
	return 1 + countNodes(rt.getLeft()) + countNodes(rt.getRight());
    }
    // ********** Question 3 *********************************
    // Iteratively process the tree to count the nodes.
    // Hint Use a Stack. In Java a Stack is a class with
    // the following methods:
    //   boolean empty()
    //   void push(E)
    //   E pop()
    //   E peek()

    public static<E> int countNodesI(TreeNode<E> rt){
	if (rt == null) return 0;
	int count = 0;
	TreeNode <E> temp = rt;
	Stack<TreeNode<E>> treeStack = new Stack<TreeNode<E>>();
	while (!treeStack.empty() || temp != null){
		if (temp != null){
			treeStack. push(temp);
			temp = temp.getLeft();
		}
		else{
			count++;
			temp = treeStack.pop();
			temp = temp.getRight();
		}
	}
	return count;
    }

    public static<E> boolean isLeaf(TreeNode<E> rt) {
	if (rt == null) return false;
	return rt.getLeft() == null && rt.getRight() == null;}
    
   public static<E> int countLeaves(TreeNode<E> rt) {
	if (isLeaf(rt)) return 1;
	if (rt == null) return 0;
	else return countLeaves(rt.getLeft()) + countLeaves(rt.getRight());
    }

    public static<E> int height(TreeNode<E> rt) {
	if (rt == null) return -1;
	return 1 + Math.max(height(rt.getLeft()), height(rt.getRight()));
    }


    public static<E> TreeNode<E> insertBalanced(TreeNode<E> rt, E value){
	if (rt == null) rt = new TreeNode<E>(value);
	return rt;
    }

    public static void main(String [] args){
	TreeNode<Integer> root = new TreeNode<Integer>(1,null,null);
	// ********  Question 1 *********************************
	root.setLeft(new TreeNode<Integer>(2,null,null));
	root.setRight(new TreeNode<Integer>(3,null,null));
	root.getLeft().setRight(new TreeNode<Integer>(4,null,null));
	root.getRight().setLeft(new TreeNode<Integer>(5,null,null));
	root.getRight().setRight(new TreeNode<Integer>(6,null,null));
	root.getRight().getLeft().setLeft(new TreeNode<Integer>(7,null,null));	
	root.getRight().getLeft().setRight(new TreeNode<Integer>(8,null,null));		 

	System.out.print("inorder : ");
	traverseInorder(root);
	System.out.print("\npreorder : ");
	traversePreorder(root);
	System.out.print("\npostorder : ");
	traversePostorder(root);
	System.out.println();

	System.out.println("# nodes: " + countNodes(root));
	System.out.println("# nodes: " + countNodesI(root));

	System.out.println("# leaves: " + countLeaves(root));
	System.out.println("height: " + height(root));


    }



}
