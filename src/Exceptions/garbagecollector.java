package Exceptions;

public class garbagecollector {
		// TODO Auto-generated method stub
public void finalize() {
	System.out.println("object is garbage collector");
}
public static void main(String[] args) {
garbagecollector s1=new garbagecollector();
garbagecollector s2=new garbagecollector();
s1=null;
s2=null;
System.gc();
	}

}
