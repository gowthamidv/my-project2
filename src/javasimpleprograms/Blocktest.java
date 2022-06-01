package javasimpleprograms;

public class Blocktest {
   {
	System.out.println("non static block");
	}
     static {
	System.out.println("static");
	}
Blocktest(){
	System.out.println("constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Blocktest obj=new Blocktest();
	}

}
