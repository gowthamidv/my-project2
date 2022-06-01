package java8features;

import java.util.ArrayList;
import java.util.List;

public class Testold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Item> itemList  = new ArrayList<Item>();
itemList.add(new Item(1,"abc",100));
itemList.add(new Item(2,"mno",800));
itemList.add(new Item(3,"pqr",2000));
itemList.add(new Item(5,"klm",4000));
List<Integer> filteredList = new ArrayList<Integer>();
for(Item item : itemList) {
	if(item.quantity < 3000) {
		filteredList.add(item.quantity);
	}
}
System.out.println(filteredList);
	}

}
