package com.javaoopspgms;

abstract class Animal1 {
	abstract void makeSound();
	public void eat() {
		System.out.println("i can eat");
	}
	}
class dog extends Animal1{
	public void makeSound()
	 {
		System.out.println("bark");
	}
}
 public class Animal{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
dog d1=new dog();
d1.makeSound();
d1.eat();
	}

}
