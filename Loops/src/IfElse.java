import java.util.Scanner;
public class IfElse {
	public static void main(String[] args)
	{
          int a;
          System.out.println("Enter Any Number");
          Scanner sc= new Scanner(System.in);
          a=sc.nextInt();
         if(a>0)
         {
      		System.out.println("Number is Positive");     			
      	 }
          else 
          {
        	     System.out.println("Number is Negative");
          }
    }
}
