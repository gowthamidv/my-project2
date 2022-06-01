package Exceptions;

import java.io.IOException;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Exception4 obj=new Exception4();
obj.method1();
System.out.println("normal flow...");
	}
void method1() {
	try {
		method2();
	}catch(Exception e) {
		System.out.println("exception handled...");
	}
}
void method2() {
	method3();
}
void method3() {
	
	System.out.println("device error...");

	
}
}
