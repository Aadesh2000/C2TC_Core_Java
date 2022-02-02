abstract class Abs1{
	
	void ex1() {
		System.out.println("abc");
	}
	
	abstract void ex2();
	
}
public class Abstract extends Abs1 {

	public static void main(String[] args) {
		Abstract ab1 = new Abstract();
		ab1.ex1();	
		ab1.ex2();

	}
	
	void ex2() {
		System.out.println("child class");
	}

}