package Queue;
import java.util.*;

 class QueueDataStructure {
	 static class Queue{
		static int arr[];
	    static int size;
		static int rear;
	
	 Queue(int size)
	{
		this.size = size;
		arr = new int[size];
		rear = -1;
	
	}
	 public boolean isEmpty()
	 {
		 return rear == -1;
	 }
	 
	 
	public void add(int data)
	{
	 if(rear == size -1)
	 {
		 System.out.println("Queue is full");
		 return;
	 }
	  
		rear = rear+1;
		arr[rear]= data;
	   System.out.println(arr[rear]);
	}
	
	
	public void remove()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			
		}
		int front = arr[0];
		int i = 0;
		for(i=0;i<rear;i++)
		{
			arr[i]=arr[i+1];
		}
		size --;
        System.out.println (" Deleted Successfully");		

	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Queue Elements are");
		for(int i = size-1 ;i>=0 ; i--)
		{
			System.out.println(arr[i]);
			
		}
	}
	
	public void peek() {
		if(isEmpty())
		{
			System.out.println("List is empty");
			return;
		}
		System.out.println(arr[0]);
		return;
	}
	

 }
	  
	  public static void main(String []args)
	  {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the size of an array");
		  int a  = sc.nextInt();
		  
		  Queue obj = new Queue(a);
			while (true) {

				System.out.println(
				"\n-----------------------"
				+"\n select the choice from the followin " 
				+ "\n 1. Insert data"
				+ "\n 2. retriev  data from the queue"
				+ "\n 3. Delete Element from the Queue"
				+ "\n-----------------------------");
				 int option = sc.nextInt();

				switch (option) {
				case 1:
					System.out.println("please enter element insert into the stack");
					
					int data = sc.nextInt();
					obj.add(data);
					
					break;
					
				case 2 : 
					 obj.display();
					break;
					
				case 3 :
					obj.remove();
					break;
				
				case 4 : 
					obj.peek();
					break;
			          

				default : System.out.println("Invalid Option");
	           }
			
	      }
	  
	  
	  }
 }
 
	


