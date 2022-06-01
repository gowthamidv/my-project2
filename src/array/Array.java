package array;
class student
{
	public int rollno;
	public String name;
	public student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
}

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student [] s;
s=new student[3];
s[0]=new student(1,"achu");
s[1]=new student(2,"harshu");
s[2]=new student(3,"gowthu");
for(int i=0;i<s.length;i++)
	System.out.println("elements at"+i+":"+s[i].rollno+" "+s[i].name);
	}

	public static void sort(String[] strArr, Object object) {
		// TODO Auto-generated method stub
		
	}

}
