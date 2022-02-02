class Aadesh{
	void arrayadd(int c[]) {
		int len=c.length;
		int ans=0;
		for(int i=0;i<len;i++) {
			ans=ans+c[i];
		}
		System.out.println(ans);
	}
}
public class SingleArray {

	public static void main(String[] args) {
		int[] a=new int[3];
		a[0]=10; 
		a[1]=20;  
		a[2]=30; 
		int b[]= {1,2,4,53,4};
		int c[]= {1,2,4,5,3,4};
//	    System.out.println("One dimensional array elements are");    
//		System.out.println(a[0]);    
//		System.out.println(a[1]);    
//		System.out.println(a[2]);   
      Aadesh ad= new Aadesh();
      ad.arrayadd(a);
      ad.arrayadd(b);
      ad.arrayadd(c);
	}

}
