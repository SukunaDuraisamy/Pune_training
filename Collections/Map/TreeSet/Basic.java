package TreeSet;

import java.util.Map;
import java.util.TreeMap;

public class Basic {

	public static void main(String[] args)
	{
		Map<Integer,String> map = new TreeMap<>();

		map.put(1, "Sukuna");
		map.put(12, "Duraisamy");
		map.put(3, "Srini");

		System.out.println(map);
	}
}