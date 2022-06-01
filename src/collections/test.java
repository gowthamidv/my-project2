package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student>list=new ArrayList<Student>();

list.add(new Student(101,"vijay",78));
list.add(new Student(106,"ajay",48));
list.add(new Student(108,"kamal",28));

System.out.println("*** sorting by agr ***");

Collections.sort(list,new Agecomparator());
for(Student st : list) {
	System.out.println(st.rollno + " " + st.name + " " + st.age);
	
	System.out.println("*** sorting by agr ***");
	
	Collections.sort(list,new Namecomparator());
	for(Student st : list) {
		System.out.println(st.rollno + " " + st.name + " " + st.age);
		
}
	}
	


