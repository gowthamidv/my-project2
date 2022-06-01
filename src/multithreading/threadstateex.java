package multithreading;

public class threadstateex  implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
threadstateex obj=new threadstateex();
Thread t =new Thread(obj);
System.out.println(t.getState());

t.start();
System.out.println(t.getState());

t.sleep(2000);
System.out.println(t.getState());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
