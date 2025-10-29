package ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> number = new ArrayList<>();
		
		int size = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Index: "+i);
			int numbers = sc.nextInt();
			number.add(numbers);
		}
		
		System.out.println("Print the ArrayList");
		System.out.println(number);
		
		Set<Integer> unique = new LinkedHashSet<Integer>(number);
		List<Integer> no_duplicate = new ArrayList<>(unique);
		
		System.out.println("Without Duplicate");
		System.out.println(no_duplicate);
		sc.close();
	}
}
