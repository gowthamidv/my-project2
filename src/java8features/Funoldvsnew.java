package java8features;

public class Funoldvsnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Thread(new Runnable() {
	@Override
	public void run() {
		System.out.println("new thread created");
	}
	
}).start();
new Thread(()->{
System.out.println("new thread created");
	}).start();

	}
}
