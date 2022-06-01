package javasimpleprograms;

public class FinalClass {
	public static final int mark;
	final int rank;
	FinalClass(){
		rank=400;
	}
	static {
		mark=100;
		
	}
final void calculate() {
	System.out.println("calculate method");
}
	public static void main(String[] args) {
		FinalClass obj=new FinalClass();
		obj.calculate();
		
		

	}

}
