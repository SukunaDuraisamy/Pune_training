package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Basic {

	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "Sukuna");
		map.put(2, "Duraisamy");
		map.put(3, "Srini");
		
		System.out.println(map);
	}
}