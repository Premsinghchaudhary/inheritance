//WAP to do the process of  Even Odd Operation Using Single Inheritance

package inheritance;
import java.util.*;
public class parent_even_or_odd
{
	
     public static void check_no()
     {
    	 int num;
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter a number: ");
          num = sc.nextInt();

         if(num % 2 == 0) {
        	 
             System.out.println(num + " is even");
         }
         else {
             System.out.println(num + " is odd");
         }
     }
     
}
