package Exceptions;

public class Exception5 {

	public static void main(String[] args)  throws CustomException{
		calculateAge(14);
	}
	static void calculateAge(int age)throws CustomException{
		// TODO Auto-generated method stub
if(age < 18) {
	throw new CustomException("age is not valid to vote");
}
	}

}
