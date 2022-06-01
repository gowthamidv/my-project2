package java8features;

import java.util.function.Consumer;

public class Consumerex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<Integer>inv = num -> System.out.println(-num);
inv.accept(5);
inv.accept(-8);

	}

}
