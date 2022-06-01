package java8features;

import java.util.function.Predicate;

public class predicateex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =8;
Predicate<Integer> isEven = num1 -> num1 % 2 == 0;
if(isEven.test(num)) {
	System.out.println(num + "is even");
}
	}

}
