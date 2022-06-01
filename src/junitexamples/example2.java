package junitexamples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class example2 {

	String msg="simplilearn";
	
	@Test
	public void testprintmsg() {
		System.out.println("inside testprintmsg()");
		assertEquals(msg,"simplilearn");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
example2 result=new example2();
result.testprintmsg();

	}

}
