import java.util.Scanner;
public class While {

	public static void main(String[] args) 
	{
		int a, ans=1;
		System.out.println("Enter Any positive number upto 20");
		Scanner sc= new Scanner(System.in);
		a =sc.nextInt();
		while(a>0) {
			ans= ans*a;
			a=a-1;
		}
          System.out.println("Factorial is" + ans);    
	}

}
