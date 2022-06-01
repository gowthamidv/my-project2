package set;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.TreeSet;

public class deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("achu");
		deque.add("sai");
		deque.add("venki");
		deque.add("harshu");
		System.out.println(deque);
		deque.pollFirst();
		System.out.println("after invoking pollfirst:" +deque);

		deque.pollLast();
		System.out.println("after invoking polllast:" +deque);

		
		deque.offer("anji");
		deque.offer("bhas");
		System.out.println("after invoking offer:" +deque);

	}

}
