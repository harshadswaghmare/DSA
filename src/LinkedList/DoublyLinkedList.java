package LinkedList;


public class DoublyLinkedList {
	Node head;
	private int size;
	String data;

	DoublyLinkedList() {
		this.size = 0;
	}

	class Node {
		String data;
		Node next;
		Node pre;

		Node(String data) {
			this.data = data;
			this.next = null;
			this.pre = null;
			size++;
		}
	}
	
	public void addFirst(String data)
	{
		
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
		head.pre = null;
		
	}
	
	public void addLast(String data)
	{
		Node node = new Node(data);
		if(head == null)
		{
			System.out.println("list is empty");
		}
		
		Node currentnode = head;
		while(currentnode.next != null)
		{
			currentnode = head;
		}
		currentnode.next = node;
		node.next = null;
	}
	public void print() {

		Node currNode = head;

		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}

		System.out.println("null");
	}
	
	public void delete()
	{

		if(head == null ) {
			System.out.println("list is empty");
		}
		Node SecondLast = head;
		size --;
		head = head.next;
		System.out.println(head.data + " is deleted successfully ");
		System.out.println("in a delete node");
		
	}
	
	public void deletelast() {
		if (head == null) // when there is no node in the list
		{
			System.out.println("list is empty");

		}
		size--;
		if (head.next == null) // when there is only one node in list
		{
			head = null;
		}
        
		Node secondlast = head;
		Node last = head.next;
		while (last.next != null) {
			secondlast = secondlast.next;
			last = last.next;

		}
		secondlast.next = null;
		System.out.println(last.data + " last node is deleted successfully");
	}
	
	
	public void show()
	{
		print();
	}

	public int getsize() {
		System.out.println("in a get size method");
		return size;
	}
	
	
	public static void main(String []args)
	{
		DoublyLinkedList list = new DoublyLinkedList();
		list.addFirst("My");
		list.print();
		list.addLast("15");
		list.print();
		list.addFirst("Harshad");
		list.print();
		list.deletelast();
		System.out.println("after delete last");
		list.print();
		list.delete();
		list.print();
		list.show();
	
  }


}
