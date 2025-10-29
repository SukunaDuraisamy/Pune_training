package Linked_List;

import java.util.LinkedList;
import java.util.List;

public class Basic {

	public static void main(String[] args)
	{
		
		List<Integer> l_list = new LinkedList<>();
		
		for(int i=0;i<5;i++)
		{
			l_list.add(i);
		}
		
		System.out.println("Print the Linked List");
		System.out.println(l_list);
		
		for(int i=0;i<l_list.size();i++)
		{
			System.out.print(l_list.get(i)+" ");
		}
	}
}