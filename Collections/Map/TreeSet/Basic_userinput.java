package TreeSet;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Basic_userinput {

	public static void main(String[] args)
	{
		Map<Integer,String> map = new TreeMap<>();

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		for(int i=0;i<size;i++)
		{
			System.out.println("Index: "+i);
			int value = sc.nextInt();
			String str = sc.next();

			map.put(value, str);
		}

		System.out.println(map);
		sc.close();
	}
}