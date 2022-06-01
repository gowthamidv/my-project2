package map;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Hashtable<Integer,String>hash=new Hashtable<Integer,String>();
		hash.put(100, "achu");
		hash.put(102, "nandhi");
		hash.put(103, "harshu");
		for(Map.Entry m : hash.entrySet()) {
			System.out.println(m.getKey()+ " " +m.getValue());
		}
		}
	}


