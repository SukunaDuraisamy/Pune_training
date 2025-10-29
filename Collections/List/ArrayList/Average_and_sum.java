package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average_and_sum {

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
		
		int sum = 0;
		for(int i=0;i<size;i++)
		{
			sum = sum + number.get(i);
		}
		
		System.out.println("Sum of Numbers is "+sum);
		
		int average = sum/size;
		System.out.println("Average is "+average);
		sc.close();
	}
}