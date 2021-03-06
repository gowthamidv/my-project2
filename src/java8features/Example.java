package java8features;

@FunctionalInterface
interface MyFunctionalInterface1{

	//A method with no parameter
    public String sayHello();
}
public class Example {

   public static void main(String args[]) {
        // lambda expression
    	MyFunctionalInterface1 msg = () -> {
    		return "Hello";
    	};
        System.out.println(msg.sayHello());
    }
}