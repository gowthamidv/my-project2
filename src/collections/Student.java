package collections;

public class Student implements Comparable<Student>{

	int rollno;
	String name;
	int age;
	

	 Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(age == st.age)return 0;
		else if(age > st.age)
			return 1;
		else 
			return -1;
	}

}
