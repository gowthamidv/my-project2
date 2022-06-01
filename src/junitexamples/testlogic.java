package junitexamples;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testlogic {
	@BeforeClass
	public static void setUpBeforeClass()throws Exception{
		System.out.println("before class");
	}
	@Before
	public  void setUp()throws Exception{
		System.out.println("before");
	}

	@Test
	public void testfindmax() {
		System.out.println("test case find max");
		assertEquals(4,calculation.findmax(new int[] {1,3,4,2}));
		assertEquals(-1,calculation.findmax(new int[] {-12,-1,-3,-4,-2}));
		
	}
	@Test
	public void testcube() {
		System.out.println("test case cube");
		assertEquals(27,calculation.cube(3));
	}
	
	@Test
	public void testreverseword() {
		System.out.println("test case reverse word");
		assertEquals("abc",calculation.reverseword("mno"));
	}
	@After
	public void teardown()throws Exception {
		System.out.println("after");
		
	}
	@AfterClass
	public static  void teardownafterclass() throws Exception {
		System.out.println("after class");
		
	}
	}

