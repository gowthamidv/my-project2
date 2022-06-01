package java8features;

import java.util.Random;
import java.util.function.Supplier;

public class Supplierex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supplier<Integer> supplier =() -> new Random().nextInt(100);
System.out.println(supplier.get());
	}

}
