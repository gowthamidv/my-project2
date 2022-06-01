package java8features;

@FunctionalInterface
interface myinterface {
	void display();
}
	
public class Methodrefex1 {
	public void mymethod(){
		System.out.println("instance method");
	}
	public static void main(String[] args) {
		Methodrefex1 obj=new Methodrefex1();
		myinterface ref = obj :: mymethod;
		ref.display();
		
	}

}
