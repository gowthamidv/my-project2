package javasimpleprograms;

public class Dog  extends Animal{
	Dog(){
		this.display();
		System.out.println("dog constructor");
	}
   public void display() {
	   System.out.println("name" +name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog obj=new Dog();
	}

}
