package Strings;

public class Immutabletestex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ImmutableClass e = new ImmutableClass("axhu");
String s1=e.name();
//e.name="change";
System.out.println("name is:" +s1);
	}
}