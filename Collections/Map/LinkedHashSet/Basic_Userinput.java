package LinkedHashSet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Basic_Userinput {

	public static void main(String[] args) 
	{
		Map<Integer,String> map = new LinkedHashMap<>();
		
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