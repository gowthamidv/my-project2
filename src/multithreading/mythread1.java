package multithreading;

public class mythread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t = new Thread("thread one");
t.start();
String str=t.getName();
System.out.println(str);
	}

}
