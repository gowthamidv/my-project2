package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOcuurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 String s;
         int max=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter String:");
         s=sc.next();
         String s1=" ";      
         for(int i=0;i<s.length();i++)
         {
              int count=0;
                 for(int j=i+1;j<s.length();j++){
                     if(s.charAt(i)==s.charAt(j))
                         count++;
                 } 
             if(count>max){
                 s1=Character.toString(s.charAt(i));
                 max=count;
         }
             else if(count==max)
                 s1=s1+" "+Character.toString(s.charAt(i));
         }

         System.out.println(s1);


     }
}