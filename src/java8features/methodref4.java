package java8features;

@FunctionalInterface
interface myyInterface2{
	hello dispaly(String say);
}
class hello{
	public hello(String say) {
		System.out.println(say);
	}
}
public class methodref4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
myyInterface2 ref = hello::new;
ref.dispaly("hello world");
	}

}
