package set;

import java.util.TreeSet;

public class Treesetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> set=new TreeSet<String>();
set.add("grapes");
set.add("apple");
set.add("guava");
set.add("orange");
System.out.println(set);
set.pollFirst();
System.out.println("after invoking pollfirst:" +set);

set.pollLast();
System.out.println("after invoking polllast:" +set);

	}

}
