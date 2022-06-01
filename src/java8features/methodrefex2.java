package java8features;

import java.util.function.BiFunction;

class multiplication{
	public static int multiply(int a,int b) {
		return a*b;
	}
}
public class methodrefex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiFunction<Integer,Integer,Integer> product = multiplication:: multiply;
int pr=product.apply(7, 8);
System.out.println("product of given num :" +pr);
	}

}
