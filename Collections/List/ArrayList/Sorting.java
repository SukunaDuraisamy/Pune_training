package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sorting {

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
		
		Collections.sort(number);
		System.out.println("Print the ArrayList");
		System.out.println(number);
		sc.close();
	}
}