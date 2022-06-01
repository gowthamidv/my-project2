package list;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Item>list=new ArrayList<Item>();

Item b1=new Item(5,"mobile",8);
Item b2=new Item(3,"cd",6);
Item b3=new Item(4,"mobilecable",9);

list.add(b1);
list.add(b2);
list.add(b3);

for(Item b:list) {
	System.out.println(b.id + " "+b.name+" "+b.quantity);
}
	}

}
