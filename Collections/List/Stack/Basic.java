package Stack;

import java.util.Iterator;
import java.util.Stack;

public class Basic {

	public static void main(String[] args)
	{
		Stack<Integer> number = new Stack<>();

		for(int i=1;i<=5;i++)
		{
			number.push(i);
		}

		Iterator<Integer> i = number.iterator();

		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		number.pop();

		i = number.iterator();

		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		number.push(20);

		i = number.iterator();

		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
	}
}