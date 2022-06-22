package inheritance;

public class Armstrong_no extends hierarchical_class
{
	public static void main (String args[]) {
		armsong(); 
	}
	  public static void armsong() {
		int num=accept();
		int res=num,r,sum=0; 
		  //declared the variable is r and datatype is int
		do //using do while loop
		    {
			 r=num%10;
			 sum=sum+( r*r*r);
			 num=num/10;
		    }
		 while(num>0); 
		 if( sum==res)  //using condition statement 
		 {
			 System.out.println(" Its is armsong ");
			 
		 }
		 else {
			 System.out.println(" Its is not armsong ");
		 }
}
}
	
