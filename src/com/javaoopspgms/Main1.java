package com.javaoopspgms;
interface shape{
	void getarea() ;
		
	}
  class rectangle1 implements shape{
	public void getarea() {
		int length=5;
		int breadth=8;
		int area=length*breadth;
		System.out.println("the area of rectangle is" +area);
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle1 r1=new rectangle1();
r1.getarea();
	}

}
