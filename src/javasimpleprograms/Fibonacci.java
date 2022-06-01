package javasimpleprograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
        int num=sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.println("fibonacci numbers are");
        
	for(int k=0;k<num;k++) {
		if(k<=1) 
			n3=k;
		else
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println(n3);
		}
			
		}
	}

