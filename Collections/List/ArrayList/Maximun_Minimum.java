package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Maximun_Minimum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> number = new ArrayList<>();
		
		int size = sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			System.out.println("Index: "+i);
			int numbers = sc.nextInt();
			number.add(numbers);
		}
		
		System.out.println("Print the ArrayList");
		System.out.println(number);
		
		System.out.println("Maximum: "+Collections.max(number));
		System.out.println("Minimum: "+Collections.min(number));
		sc.close();
	}
}