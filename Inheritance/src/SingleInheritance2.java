class Calculation {
	int ans;
	
	void add(int x, int y) {
		ans = x + y;
		System.out.println("Addition is: " + ans);
	}
}

class Test extends Calculation {
	void substract(int x, int y) {
		ans = x - y;
		System.out.println("Substraction is: " + ans);
	}
}

public class SingleInheritance2 {

	public static void main(String[] args) {
		Test t = new Test();
		t.substract(20, 10);
		t.add(10, 5);
	}
}

