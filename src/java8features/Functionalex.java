package java8features;

import java.util.function.Function;

public class Functionalex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<Double,Double> square = (num) -> Math.sqrt(num);
System.out.println(square.apply(5.0));
	}

}
