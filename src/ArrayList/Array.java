package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*public class Array {


public static void main(String []args)
{
  int str;
  Scanner sc = new Scanner(System.in);
  System.out.println("how many value do you want to enter ");
  str = sc.nextInt();
  
  //System.out.println("enter the no");
  //int n = sc.nextInt();
  ArrayList<String> al = new ArrayList<>();
  // int [] ab = new int[10];
  for(int i =0;i <= str ;i++)
  {
    	al.add(sc.nextLine());
    	
  }
  for(int i =0;i <= str ;i++)
  {
	  ab[i]= sc.nextInt();
    	
  }
 
  System.out.println("Arrays Elements are" );
  System.out.println("array : ");
  for(int i = 0; i< n; i++)
  {
	  System.out.println(ab[i] + " ");
  }
  for(String value : al)
  {
	  System.out.println(value + " ");
  }
  
}
}
*/
class Array{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of list");
		int size= sc.nextInt();
		ArrayList<String>list = new ArrayList<>();
		for(int i=0 ;i<size+1;i++)
		{
			list.add(sc.nextLine());
			
		}
		System.out.println("List Elements are :");
		for(String elements : list)
		{
			System.out.print(elements + " ");
		}
	}
}




