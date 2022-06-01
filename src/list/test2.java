package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>list =new LinkedList<String>();
list.add("pune");
list.add("gao");
list.add("nandhi");
Iterator<String> itr=list.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
((LinkedList<String>) list).addFirst("mysure");
System.out.println("after invoking addfirst method:" +list);

	((LinkedList<String>) list).addLast("mandhya");
	System.out.println("after invoking addlast method:" +list);
	
	((LinkedList<String>) list).add( 1,"mysure");
	System.out.println("after invoking add method:" +list);
	LinkedList<String> list2=new LinkedList<String>();
	list2.add("vizag");
	
	list.addAll(list2);
	System.out.println("after invoking addall method" +list);
	((LinkedList<String>) list).removeFirst();
	System.out.println("after invoking removefirst method" +list);
	
	((LinkedList<String>) list).removeFirstOccurrence
	("bangalore");
	System.out.println("after invoking removefirst method" +list);
	
	list.clear();
	System.out.println("after invoking clear method" +list);
	
	
	
	
	
	}
	}
		
	
		
	


