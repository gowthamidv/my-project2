package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<>();
		list.add("pune");
		list.add("goa");
		list.add("mysore");
		list.add("belgum");
		System.out.println("maximum value from the collection:" +Collections.max(list));
		
		

		List<Integer> list1=new ArrayList<>();
		list1.add(45);
		list1.add(24);
		list1.add(67);
		list1.add(87);
		System.out.println(list1);
		
	}

}
