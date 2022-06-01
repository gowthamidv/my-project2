package java8features;

public class funinter2  implements FunctionalInf{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
funinter2 obj=new funinter2();
System.out.println(obj.calculate(4,5));
	}
public int calculate(int num1,int num2) {
	return num1+num2;
}
}
