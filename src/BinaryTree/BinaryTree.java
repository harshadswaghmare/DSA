

package BinaryTree;
public class BinaryTree{
	class Node{
		int key;
		Node left,right;
		
	}
}


/*package BinaryTree;

//public class BinartTree {
	

//}



class Bst
{
   class Node
   {
	   int key;
	   Node left,right;

	   Node(int data)
	   {
		  key = data;
	     left=right=null;
	   }
    }
   
   Node root;
   Bst(){
	   root = null;
   }
   
   void insert(int key) {
	   root = insertshow(root,key);
	   
   }
   Node insertshow(Node root, int key) {
	   if(root == null)
	   {
		   root = new Node(key);
		  
	   }
	   if(key > root.key) {
		   root.right = insertshow(root.right,key);
	   }
	   else if(key<root.key) {
		   root.left = insertshow(root.left,key);
	   }
	return root;
   }
   
   void inorder()
   {
	   inorderroot(root);

   }
   void inorderroot(Node root)
   {
	   if(root!=null)
	   {
		   inorderroot(root.left);
		    System.out.println(root.key +  " ");
		    inorderroot(root.right);
	   }
   }
   
 /*  void preorder()
   {
	   preorderroot(root);
   }
   void preorderroot(Node root)
   {
	   if( root!=null)
	   {
	     preorderroot(root.right);
	     System.out.println(root.key + " ");
	     preorderroot(root.left);
	   

 }

class BinaryTree {  

   public static void main(String []args)
   {
     Bst obj = new Bst();
     obj.insert(55);
     obj.insert(70);
     obj.insert(66);
     System.out.println("Inorder root from left to right:");
     obj.inorder();
     //System.out.println("series of preorder root is");
     // obj.preorder();
   }

}*/

