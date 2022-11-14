package Tree;

import java.util.*;


public class BinaryTree { 
	
	public static final String Red = "\\u001B[31m";
    static class Node {    
       int value; 
        Node left, right; 
          
        Node(int value){ 
            this.value = value; 
            left = null; 
            right = null; 
        } 
     
    } 
       
    public void insert( Node node, int value) {
    	
        if (value < node.value)
        {
        	if (node.left != null)
            { 
        		insert(node.left, value); 
            }
          
           else
           {
        	System.out.println(" Inserted " + value + " to left of " + node.value); 
        	node.left = new Node(value); 
        	}
        }
       else if (value > node.value)
       {
    
          if (node.right != null) {
            insert(node.right, value);
          } else {
            System.out.println("  Inserted " + value + " to right of "
                + node.value);
            node.right = new Node(value);
          }
        }
    }
      
    void inorderroot(Node node)
    {
   
 	   if(node!=null)
 	   {
 		   inorderroot(node.left);
 		    System.out.println(node.value +  " ");
 		    inorderroot(node.right);
 	   }
    }
    

  
     
     
     public static void main(String args[]) 
    { 
    	  final String Red = "\\u001B[31m";
    	 BinaryTree tree = new BinaryTree();
    	 Scanner sc = new Scanner(System.in);
    	 Node root = new Node(5);
    	 int data;
		 int option;
      
    	while(true) {
			 
			 System.out.println("select the choice from the following" 
			 +"\n 1. Insert data"
			 +"\n 2. Display all data");
			 option = sc.nextInt();
			 
			 switch(option)
			 {
			 case 1 : System.out.println("insert data into the tree");
			  data = sc.nextInt();
			   tree.insert(root, data);
			 
			 case 2:System.out.println(Red + "data in tree are");
			      tree.inorderroot(root);
			      break;
			
			 }
			 
		
      
			    
               /* System.out.println("Binary Tree Example");
                System.out.println("Building tree with root value " + root.value);
                tree.insert(root, 2);
                tree.insert(root, 4);
                tree.insert(root, 8);
                tree.insert(root, 6);
                tree.insert(root, 7);
                tree.insert(root, 3);
                tree.insert(root, 9);
                System.out.println("Traversing tree in order");
                
                System.out.println("Inorder traversing pattern");
               tree.inorderroot(root);
               // tree.traverseLevelOrder(); */
              
                
              }
    }
 }


