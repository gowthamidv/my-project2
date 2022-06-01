package Strings;

public class Stringtest5 {

	String name;
	String city;
	

	public Stringtest5(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return name+" " +city;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringtest5  s1=new Stringtest5 ("axhu","pune");
		System.out.println(s1);


	}

}
