package Optionals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<user>userList=Arrays.asList(new user("abc",33),new user("mno",56),new user("pqr",89));
List<user>sortedList=userList.stream().sorted(Comparator.comparingInt(user::getAge)).collect(Collectors.toList());
sortedList.forEach(System.out::println);
	}

}
