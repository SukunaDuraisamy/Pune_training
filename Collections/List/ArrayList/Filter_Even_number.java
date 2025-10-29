package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filter_Even_number {

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

		List<Integer> even = new ArrayList<Integer>();
		for(int i=0;i<size;i++)
		{
			if(number.get(i) % 2 == 0)
			{
				even.add(number.get(i));
			}
		}

		System.out.println("Print the ArrayList");
		System.out.println(even);	
		sc.close();
	}
}