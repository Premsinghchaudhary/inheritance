//WAP to do the process of SUM OF Digit and armstrong no by using hierarchical Inheritance
package inheritance;

import java.util.Scanner; 

public class hierarchical_class
{
	 static int num;
	public static int accept()
	{
		Scanner sc= new Scanner( System.in); 
		System.out.println( " Enter the digits: ");
		num=sc.nextInt();
		System.out.println("digits = "+num);
			return num;
	}

 }