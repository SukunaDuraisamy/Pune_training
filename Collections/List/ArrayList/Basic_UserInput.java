package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic_UserInput {

	public static void main(String[] args) 
	{
		//Scanner for input
		Scanner sc = new Scanner(System.in);
		List<String> name = new ArrayList<>();
		
		System.out.println("Enter size of ArrayList");
		int size =  sc.nextInt();
		
		//User Input
		for(int i=0;i<=size;i++)
		{
			System.out.println("Index: "+i);
			String input = sc.next();
			name.add(input);
		}
		
		//Printing the ArrayList
		System.out.println("Print the ArrayList");
		System.out.println(name);
				
		//Removing element in ArrayList
		String Remove = sc.next();
		name.remove(Remove);
		
		//Printing the ArrayList
		System.out.println("Print the ArrayList");
		System.out.println(name);
		sc.close();
	}
}