package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String> list=new ArrayList<String>();
	list.add("pune");
	list.add("goa");
	list.add("mysore");
	list.add("belgum");
	System.out.println("intial collection value:" +list);
	
	Collections.addAll(list,"mumbai","kashmir");
	System.out.println("after adding elements  collection value:" +list);
	
	String[] srtArr= {"jaipure"};
	Collections.addAll(list,srtArr);
	System.out.println("after adding array  collection value:" +list);
	
}
}
