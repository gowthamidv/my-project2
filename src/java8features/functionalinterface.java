package java8features;

@FunctionalInterface
interface  MyFunctionalInterface{
public  int addMethod(int a,int b);
}
	
	
public class functionalinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyFunctionalInterface  sum=(a,b)->a+b;
System.out.println("result :" + sum.addMethod(12,14));
	}

}
