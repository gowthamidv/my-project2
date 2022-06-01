package Optionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<List<Integer>> list=new ArrayList();
list.add(Arrays.asList(1,2));
list.add(Arrays.asList(3,4));
list.add(Arrays.asList(5,6));
list.add(Arrays.asList(7,8));
System.out.println("list of list" +list);
List<Integer>flatList=list.stream().flatMap(l->l.stream()).collect(Collectors.toList());
System.out.println("list generates by flatmap"+flatList);
	}

}
