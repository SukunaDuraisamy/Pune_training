package ArrayList;

import java.util.ArrayList;

public class Basic {

	public static void main(String[] args) 
	{
		//Create an ArrayList
		ArrayList<Integer> al = new ArrayList<>();
		
		//Appending new elements at the end of the list
		for(int i=1;i<=5;i++)
		{
			al.add(i);
		}
		
		System.out.println("Print the ArrayList");
		System.out.println(al);
		
		//Removing element in the index 2
		al.remove(2);
		System.out.println("After Removing");
		System.out.println(al);
		
		//Adding element in last index
		al.add(8);
		System.out.println("After Adding");
		System.out.println(al);
		
		//Print element one by one
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
	}
}
