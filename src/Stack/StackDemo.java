package Stack;

import java.util.Scanner;


public class StackDemo {
	public static final  String Red ="\u001B[31m";
	public static final String yellow ="\\u001B[33m";

	int stack[];
	int top;
	int capacity;

	StackDemo(int size) {
		top = -1;
		capacity = size;
		stack = new int[size];
	}

	public void push(int no) {
		if (isfull()) {
			System.out.println(Red +"Stack is overflow");
			
		} else {
			top = top + 1;
			stack[top] = no;
			System.out.println(no + " Inserted successfully");
		}
	}

	public void pop() {
		if (isempty()) {
			System.out.println("No element in a stack, stack is in underflow situation");
		} else {
			top = top - 1;
			System.out.println(" is poped out");

		}
	}

	public boolean isfull() {
		return top >= capacity - 1;
	}

	public boolean isempty() {
		return top == -1;
	}

	public void display() {
		System.out.println("Stack elements are");
		for (int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

	public void peek() {
		System.out.println("top most element of the stack is : " + stack[top]);
	}

	public static void main(String[] args) {
	   
		System.out.println("Hello world");

		try (Scanner sc = new Scanner(System.in)) {
			int size, data, option;
			System.out.println("Enter the size of an stack");
			size = sc.nextInt();

			StackDemo obj = new StackDemo(size);
			while (true) {

				System.out.println(yellow +
				"\n-----------------------"
				+"\n select the choice from the followin " 
				+ "\n 1. Insert data"
				+ "\n 2. pop data from the stack"
				+ "\n 3. peek element from the stack"
				+ "\n 4.Display the element of the stack"
				+ "\n-----------------------------");
				option = sc.nextInt();

				switch (option) {
				case 1:
					System.out.println("please enter element insert into the stack");
					data = sc.nextInt();
					obj.push(data);
					break;

				case 2:
					System.out.println(" pop the element you want");
					obj.pop();
					break;

				case 3:
					obj.peek();
					break;

				case 4:
					obj.display();
					break;

				default:
					System.out.println("please select valid option");
					break;
				}
			}
		} catch (Exception c) {
			System.out.println("Exceptin occured: " + c);
		}

	}

}
