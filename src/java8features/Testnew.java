package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Testnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> itemList  = new ArrayList<Item>();
		itemList.add(new Item(1,"abc",100));
		itemList.add(new Item(2,"mno",800));
		itemList.add(new Item(3,"pqr",2000));
		itemList.add(new Item(5,"klm",4000));
		List<Integer> filteredList1 = new ArrayList<Integer>();
		
		
		List<Integer>filteredList11 = itemList.stream().filter(p->p.quantity < 3000)
				.map(p->p.quantity)
				.collect(Collectors.toList());
		System.out.println(filteredList11);
	}

}






