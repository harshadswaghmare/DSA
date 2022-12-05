package Demo;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	public static void main(String args[])
	{
		List list = new ArrayList();
		list.add("harshad");
		list.add(10);
		list.add(1.5);
		list.add("Thanks");
		System.out.println(list);
		try{
		System.out.println("using generics");
		List <String>list1 = new ArrayList();
		list1.add("harshad");
		list1.add("10");
		list1.add("25");
		list1.add("Thanks");
		System.out.println(list);
	
	}catch(Exception e)
		{
		  System.out.println("occured :" + e);
		}
	}

}
