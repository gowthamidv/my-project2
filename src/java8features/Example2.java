package java8features;
@FunctionalInterface
interface MyFunctionalInterface5{

	//A method with no parameter
    public  int increment(int a);
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyFunctionalInterface5 f = (num) -> num+5;
System.out.println(f.increment(22));
	}

}
