import java.util.Scanner;
public class DoWhile {

	
	public static void main(String[] args) 
	    {  
		    int i = 1,ans = 1;     
		    Scanner sc = new Scanner(System.in);    
		    System.out.println("Enter the number to find factorial");  
		    int num = sc.nextInt(); 
		         do {  
		              ans = ans * i;   
		              i++;   
		            } while( i <= num );  
		              System.out.println("Factorial of " + num + " is: " + ans);  
		}  
		  

	}


