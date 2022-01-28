import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, 
		c;
        System.out.println("Enter Number");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter Number");
        b=sc.nextInt();
        System.out.println("Choose one option (Note- 1 for addition, 2 for substraction)");
        c=sc.nextInt();
        if (c==1 || c==2) 
        {
        	if(c==1)
        	{
        		c=a+b;
                System.out.println("Addition is" + c);
        	}else
        	{
        		c=a-b;
                System.out.println("Subtraction is" + c);
        	}
        }else
        {
        	System.out.println("Tata Bye Bye...Khatam!");
        }
        
	}

}
