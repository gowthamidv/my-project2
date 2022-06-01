package Assignment2;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner t=new Scanner(System.in);
System.out.println("enter a word");
String st=t.next();
String temp="";
for(int i=st.length()-1;i>=0;i--)
{
	temp=temp+st.charAt(i);
}
if(st.equals(temp))
{
	System.out.println("palindrome");
}
	else {
		System.out.println(" not palindrome");
}
	}
}


