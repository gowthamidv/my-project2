package com.javaoopspgms;
class person{
	private int age;
	public int getage() {
		return age;
		
	}
	public void setage(int age) {
		this.age=age;
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
person p1=new person();
p1.setage(89);
System.out.println("my age is:" +p1.getage());

	}

}
