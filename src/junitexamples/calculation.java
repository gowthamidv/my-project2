package junitexamples;

import java.util.StringTokenizer;

public class calculation {

	public static int findmax(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		return max;
		
		}
	public static int cube(int n) {
		return n*n*n;
	}
	public static String reverseword(String str) {
		StringBuilder sb=new StringBuilder();
		StringTokenizer tokenizer=new StringTokenizer(str,"");
		
		while(tokenizer.hasMoreTokens()) {
			StringBuilder sb1=new StringBuilder();
			sb1.append(tokenizer.nextToken());
			sb1.reverse();
			
			result.append(sb);
			result.append("");
		}
			
		
		return  result.toString();
	}
	}

