package LinkedList;

public class LinkedList {
	Node head;
	private int size;
	String data;

	LinkedList() {
		this.size = 0;
	}

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	public void addFirst(String data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode; 
	}

	public void addlast(String data) {
		Node newnode = new Node(data);
		if (head == null) {
			newnode = head;
		}
		Node currnode = head;
		while (currnode.next != null) {
			currnode = head;
		}
		currnode.next = newnode;
		
	}

	public void print() {

		Node currNode = head;

		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}

		System.out.println("null");
	}

	public void delete() {

		if (head == null) // when list is empty;
		{
			System.out.println("List is empty");
			return;

		}
		size--;
		head = head.next;

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
		System.out.println("last node is deleted successfully");
	}

	public int getsize() {
		System.out.println("in a get size method");
		return size;
	}

	public void search(String data) {

		Node current = head;

		int i = 1;

		boolean flag = false;
		if (head == null) {
			System.out.println("List is empty");
		}

		else {
			while (current != null) {
				if (current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		
		if(flag)
		{
			System.out.println("Element is found at position"+ i);
		}
		else {
			System.out.println("Element is not found in the list, search again");
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		ll.addFirst("Harshad");
		ll.addFirst("is");
		ll.addFirst("name");
		ll.addFirst("My");
		ll.print();
		ll.delete();
		ll.print();
		ll.deletelast();
		ll.print();
		ll.search("Name");

	}

}
