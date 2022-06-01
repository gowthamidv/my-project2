package javasimpleprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
int d=sc.nextInt();
int fact=1;
for(int i=1;i<=d;i++) {
	fact=fact*i;
}
System.out.println("factrorial of given num=" +fact);
}

	}


