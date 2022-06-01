package java8features;
interface Stringconcat{
	public String Stringconcat(String a,String b);
}
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stringconcat s = (str1,str2) ->  str1+str2;
System.out.println("result:" + s.Stringconcat("hello","hi"));
	}

}
