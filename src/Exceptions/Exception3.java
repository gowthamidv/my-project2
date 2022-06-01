package Exceptions;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calculateAge(25);
System.out.println("rest of the code");
	}
public static void calculateAge(int age) {
	if(age<18) {
		throw new ArithmeticException("person age isnot eligible to vote");
	}else {
		System.out.println("person is eligible to vote");
	}
}
}
