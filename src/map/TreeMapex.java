package map;

import java.util.TreeMap;

public class TreeMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> map= new TreeMap<Integer,String>();
map.put(1, "chennai");
map.put(2, "jaipure");
map.put(3,"haryana");
System.out.println("descendingmap:" + map.descendingMap());

System.out.println("headmap:" + map.headMap(3,false));
System.out.println("tailmap:" + map.tailMap(2,true));
System.out.println("submap:" + map.subMap(1,false,2,true));

	}

}
