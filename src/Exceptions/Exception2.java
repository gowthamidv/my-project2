package Exceptions;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	try {
		System.out.println("divide by 0");
		int b=39 / 0;
	}
	catch(NumberFormatException e) {
		System.out.println(e);
		
	}

	}finally {
		System.out.println("finally block");
	}
	}
	}


