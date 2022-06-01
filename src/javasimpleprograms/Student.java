package javasimpleprograms;

public class Student {
	 int id;
	 String name;
	 int age;
	 Student(){
		 
	 }
	 Student(int id){
		 this.id=id;
		 
	 }

	public static void main(String[] args) {
		
      Student s1=new Student();
      s1.id=10;
      s1.name="abc";
      
      System.out.println(s1.id);
      System.out.println(s1.name);
      s1.Calculateage(s1,2000);
      System.out.println(s1.age);
     	
	}
	public int Calculateage(Student s1, int year) {
		int age=2022-year;
		return s1.age= age;
		
	}

}
