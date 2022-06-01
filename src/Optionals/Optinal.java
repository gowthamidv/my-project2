package Optionals;

public interface Optinal {
public int calculate(int num1,int num2);
default double sqrt(int num1) {
	return Math.sqrt(num1);
}
static double findExponential(int num1) {
	return Math.exp(num1);
			
			
}
public static Optinal ofNullable(String string) {
	// TODO Auto-generated method stub
	return null;
}

}
