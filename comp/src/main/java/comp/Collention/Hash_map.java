package comp.Collention;

import java.util.HashMap;
import java.util.Map;

public class Hash_map {

	public static void main(String[] args) {
		//details1
		Map<String, String> map1= new HashMap<String, String>();
		//insert
		map1.put("patil", "mha");
		map1.put("shrma", "delhi");
		map1.put("pavan", "hyd");
		
		
		
		//details2
		Map<String, String> map= new HashMap<String, String>();
		//Update
		map.put("pavan", "ELR");
		//Insert
		map.put("ravi", "elr");
		//Merge
		map.putAll(map1);
		//GetBy Id
		System.out.println(map.containsKey("pavan"));
		//Delete
		map.remove("ravi");
		System.out.println(map);
	}
}
