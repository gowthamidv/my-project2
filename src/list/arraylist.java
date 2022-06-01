package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String> list=new ArrayList<String>();
	list.add("pune");
	list.add("goa");
	list.add("mysore");
	list.add("belgum");
	System.out.println(list);
	
	//Iterator<String> itr=list.iterator();
	//while(itr.hasNext()) {
		//System.out.println(itr.next());
	//}
//for(String fruit:list)
	//System.out.println(fruit);
	//}
//}
	System.out.println("returning element:" +list.get(1));
	list.set(1, "delhi");
	System.out.println("updated list " +list);
	
	Collections.sort(list);
	System.out.println("sorted list" +list);
	
	list.remove(2);
	System.out.println("after invoking remove" +list);
	
	list.removeAll(list);
	System.out.println("after invoking removeall" +list);
	list.add("poo");
	list.add("moo");
	list.add("noo");
	System.out.println(list);
	
	
	list.clear();
	System.out.println("after invoking clear" +list);
	
	System.out.println("after invoking empty" +list.isEmpty());
	}
}
