package javasimpleprograms;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Addition.add(11,11));
		System.out.println(Addition.add(11,11,11));
	}
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	static double add(double a,double b) {
		return a+b;
	}

}
