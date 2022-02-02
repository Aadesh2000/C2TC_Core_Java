
class Triangle{
	void a() {
		System.out.println("This is Triangle");
	}
}

class Circle extends Triangle{
	void b() {
		System.out.println("This is Circle");
	}
}

class Square extends Circle{
	void c() {
		System.out.println("This is Square");
	}
}
public class MultilevelInheritance2 {

	public static void main(String[] args) {
		Square s = new Square();
		s.a();
		s.b();
		s.c();
	}
}