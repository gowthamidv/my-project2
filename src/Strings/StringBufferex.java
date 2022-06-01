package Strings;

public class StringBufferex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer("delhi is ");
sb.append("capatial");
System.out.println(sb);

sb.insert(1,"abc");
System.out.println(sb);

sb.replace(1,3,"java");
System.out.println(sb);

sb.delete(1,6);
System.out.println(sb);

sb.reverse();
System.out.println(sb);

	}

}
