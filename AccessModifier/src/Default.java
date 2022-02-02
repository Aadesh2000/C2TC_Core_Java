class Defaultdemo{
	
	void print() {
		System.out.println("I am default");
	}
	
}
public class Default {
//	if you don't mention any access modifier then it is by default Default.
//	it is only accessible within same project.

	public static void main(String[] args) {
		Defaultdemo d1=new Defaultdemo();
		d1.print();
	}
	
}
