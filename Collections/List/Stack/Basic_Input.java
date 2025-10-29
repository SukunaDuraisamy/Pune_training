package Stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Basic_Input {

	public static void main(String[] args) 
	{
		Stack<String> number = new Stack<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Stack: ");
		int size = sc.nextInt();

		for(int i=1;i<=size;i++)
		{
			System.out.println("Index: "+i);
			String name = sc.next();
			number.push(name);
		}

		Iterator<String> it = number.iterator();

		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		number.pop();
		it = number.iterator();

		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("Enter the value to push: ");
		String str = sc.next();
		number.push(str);
		
		it = number.iterator();

		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		sc.close();
	}
}
