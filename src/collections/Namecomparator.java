package collections;

import java.util.Comparator;

public class Namecomparator implements Comparator<Student> {

	
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.name == s2.name)
		return 0;
		else if(s1.this.name > s2.this.name)
			return 1;
		else
			return -1;
	}
	
}
