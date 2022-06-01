package javasimpleprograms;

public class Staticexample {
static int count=5;
public static void main(String args[]) {
	Staticexample obj1=new Staticexample();
	Staticexample obj2=new Staticexample();

	obj1.increment();
	obj2.increment();
	System.out.println("obj1: count is="+obj1.count);
	System.out.println("obj2:  count is=" +obj2.count);
}

public void increment() {
	count++;
}
}
