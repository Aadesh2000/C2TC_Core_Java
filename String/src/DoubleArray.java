
public class DoubleArray 
{

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,5},{3,4,4}};
		int b[][]= {{1,2,5},{3,4,4}};
		//System.out.println(a);
		//System.out.println("a[0][2] = " + a[0][2]);
		int c[][]=new int[3][3];
		for(int i=0;i<2;i++)
		{    
			for(int j=0;j<3;j++)
			{    
			c[i][j]=a[i][j]+b[i][j];	
			
			 System.out.print(c[i][j]+" "); 
			}
			System.out.println();
			
		}
	
    }
}
