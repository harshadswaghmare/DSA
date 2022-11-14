package TreeDSA;

public class TreeDemo {

	static class Node {
		int value;
		Node left, right;

		public Node(int value) {
			this.value = value;
			left = right = null;
		}

	}

	public void insertdata(Node node, int value) {
		if (value < node.value)
		{
			if (node.left != null) 
			{
				insertdata(node.left, value);
				System.out.println("Data is inserted at left child of root");
			}
			else
			{
				System.out.println("Inserted " + value + " to left of " + node.value);
				node.left = new Node(value);
			}

		} 
		else if (value > node.value)
		{
			if (node.right != null) 
			{
				insertdata(node.right, value);
				node.right = new Node(value);
				System.out.println("Data is inserted");

			}
			else
			{
				System.out.println("Inserted " + value + " to right of " + node.value);
				node.right = new Node(value);
			}
		}

		else 
		{
			System.out.println("Data is not inserted");
		}
	}

	
	void inorder(Node node) {

		if (node != null) {
			inorder(node.left);
			System.out.println(node.value + " ");
			inorder(node.right);
		}
	}
		
	public void preorder(Node node) {
		if (node != null) {
			preorder(node.left);
			preorder(node.right);
			System.out.println(node.value + " ");
		}
	}

	public static void main(String[] args) {
		TreeDemo obj = new TreeDemo();
		Node root = new Node(5);

		obj.insertdata(root, 10);
		obj.insertdata(root, 11);
		obj.insertdata(root, 4);
		System.out.println("values are");
		obj.inorder(root);
		System.out.println("values of tree in preorder format");
		obj.preorder(root);
	}

}
