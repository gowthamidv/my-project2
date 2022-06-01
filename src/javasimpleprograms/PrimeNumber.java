package javasimpleprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
        int num=sc.nextInt();
        int temp;
        boolean s=true;
        for(int i=2;i<=num/2;i++) { //++i sme
        	//temp=num%i;
        	//if(temp==0) or
        	if(num%i==0)
        	{
        		s=false;
        		break;
        		
        	}
        }
        if(s)
        System.out.println(num +"is prime number");
        else
        	System.out.println(num +"is not a prime");
	}

}
