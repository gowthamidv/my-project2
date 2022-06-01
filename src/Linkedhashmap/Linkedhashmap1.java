package Linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer,String>map=new LinkedHashMap<Integer,String>();
map.put(1, "chennai");
map.put(2, "jaipure");
map.put(3, "haryana");
for(Map.Entry m : map.entrySet()) {
	System.out.println(m.getKey()+ " " +m.getValue());
}
}

	
	
	
	
}
