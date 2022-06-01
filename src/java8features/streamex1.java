package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>list=Arrays.asList(2,3,4,5);
list=list.stream().map(x->x*x).collect(Collectors.toList());
System.out.println(list);

List<String>nameList=Arrays.asList("achu","harshu","santhu","basu");
nameList=nameList.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
System.out.println(nameList);

List<String>listobj=Arrays.asList("achu","harshu","santhu","basu");
Optional<String>firstVal=listobj.stream().filter(s->s.startsWith("A")).findFirst();
System.out.println(firstVal.get());


	}
	
}
