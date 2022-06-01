package java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Streamex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<String>nameList=Arrays.asList("achu","harshu","santhu","basu");
//nameList=nameList.stream().sorted().collect(Collectors.toList());
nameList=nameList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
System.out.println(nameList);

List<Integer>list=Arrays.asList(2,3,4,5);
list.stream().map(x->x*x).forEach(y->System.out.println(y));

int even=list.stream().filter(x->x % 2 == 0).reduce(0, (sum,val)-> sum + val);
System.out.println(even);
	}

}
