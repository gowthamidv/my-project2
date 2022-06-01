package javasimpleprograms;

public class ifstatements {

	public static void main(String[] args) {
		int age=80;
		if(age == 80) {
			System.out.println("age is 80");
		}
		if(age == 40) {
			System.out.println("age is 30");
		}else {
			System.out.println("age is not 30");
			
		}
		if(age == 40) {
			System.out.println("age is 40");
		}else if(age == 60) {
			System.out.println("age is  50");
		}else {
			System.out.println("age is not 50");
		}

		
		age =90;
		if(age == 90) {
			if(age >= 90)
			System.out.println("age is 90");
		}
	 else {
		System.out.println("age is not 90");
		}
		
	}
}



