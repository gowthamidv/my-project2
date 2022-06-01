package map;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class hashmapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"achu");
		map.put(2,"sai");
		map.put(3,"venki");
		map.put(4,"harshu");
		System.out.println("after put duplicate value:" +map);
		
		//System.out.println("Iterating hashmap:");
		//for(Map.Entry m : map.entrySet())
		//System.out.println(m.getKey()+" " +m.getValue());
	//}
		//map.put(2, "kochi");
		//System.out.println("after put duplicate value:" + map);
map.putIfAbsent(3, "venki");
System.out.println("after  invoking putifabsent() :" +map);
map.remove(2);
System.out.println("after invoke remove():" +map);


System.out.println("after invoke containskey():" +map);

map.replace(2, "balaji");
System.out.println("after invoke replace():" +map);

map.replaceAll((k,v)->"balaji");
System.out.println("after invoke replaceall():" +map);;

	}
		
	}




