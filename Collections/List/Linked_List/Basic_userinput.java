package Linked_List;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Basic_userinput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<String> l_list = new LinkedList<>();
		
		int size = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Index: "+i);
			String str = sc.next();
			l_list.add(str);
		}
		
		System.out.println("Print the Linked List");
		System.out.println(l_list);
		sc.close();
	}
}