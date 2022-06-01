package javasimpleprograms;

public class Bike1  extends Engine {

	public void run() {
		System.out.println("bike running safely");
	}
	public static void main(String[] args) {
		Engine obj=new Bike1();
		obj.run();

	}

}
