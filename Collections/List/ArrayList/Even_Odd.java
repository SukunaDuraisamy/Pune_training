package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Even_Odd {

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
		
		int even = 0;
		int odd = 0;
		
		for(int i=0;i<size;i++)
		{
			if(number.get(i) % 2 == 0)
			{
				even = even + 1;
			}
			else
			{
				odd = odd + 1;
			}
		}
		
		System.out.println("Even Numbers: "+even);
		System.out.println("Odd Numbers: "+odd);
		sc.close();
	}
}