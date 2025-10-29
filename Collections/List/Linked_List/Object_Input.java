package Linked_List;

import java.util.LinkedList;
import java.util.List;

public class Object_Input {
	public static void main(String[] args) 
	{
		List<Object> ob = new LinkedList<>();
		ob.add("Sukuna");
		ob.add(13);
		ob.add("Vignesh");
		ob.add(17);
		System.out.println(ob);
		List<Object> ob2 = Display(ob);
		System.out.println(ob2);
	}
	
	public static List<Object> Display(List<Object> list)
	{
		return list;
	}
}