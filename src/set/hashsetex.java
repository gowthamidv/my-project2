package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> set=new HashSet<String>();
set.add("one");
set.add("two");
set.add("three");
set.add("four");
set.add("five");
Iterator<String> i=set.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
set.remove("two");
System.out.println("after invoking remove method" +set);

set.removeIf(str->str.contains("four"));
System.out.println("after invoking removeif method" +set);
}
	}


