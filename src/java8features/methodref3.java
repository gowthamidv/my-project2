package java8features;

import java.util.Arrays;

public class methodref3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] StrArr= {"abc","mno","klm","plk"};
Arrays.sort(StrArr,String::compareToIgnoreCase);
for(String str:StrArr) {
	System.out.println(str);
}
	}

}
