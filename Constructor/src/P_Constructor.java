public class P_Constructor {
	int age;
	String name;
	
	public P_Constructor(int a, String b)
	{
		age=a;
		name=b;
	}

	public static void main(String[] args) {
		P_Constructor pc1 = new P_Constructor(10,"Ram");
		P_Constructor pc2 = new P_Constructor(15,"Sham");
		
		System.out.println(pc1.name +"'s age is " + pc1.age);
		System.out.println(pc2.name +"'s age is " + pc2.age);
	}

}