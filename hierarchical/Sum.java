package inheritance;

 public class Sum extends hierarchical_class{
	 public static void main(String agrs[]) {
		 sum_of_digits();
	 } 
	 public static void sum_of_digits()
	 {
		 int num= accept();
			int res,sum=0;
		 
			do 
			{
				res=num%10;  
				sum=sum+res;  
				num=num/10;       
			}
			while( num>0);
			System.out.println("The sum of digits is = " + sum);
			
		   
	 }
	 
 }