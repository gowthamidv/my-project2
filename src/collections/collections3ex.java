package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collections3ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<>();
		list.add("pune");
		list.add("goa");
		list.add("mysore");
		list.add("belgum");
		Collections.sort(list);;
		System.out.println("sorting collection value asc:" +list);
	
		
		Collections.sort(list,Collections.reverseOrder());;
		System.out.println("sorting collection value desc:" +list);
		
	}

}
