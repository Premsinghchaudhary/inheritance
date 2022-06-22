//WAP to do the process of swapping , Greater between 5 no, 
//Check charactyer is vowel or not using Multilevel Inheriutance 

package inheritance;

import java.util.Scanner;

public class Main_class
{
	static int x,y,temp, i,max,size;
	  static char c;
	 static Scanner sc= new Scanner(System.in);
	 
	 
	public static void swapping()
	{
		System.out.println(" enter the value of x and y :");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println(" x = "+x);
		System.out.println(" y = "+y);
		temp=x+y;
		x=temp-x;
		y=temp-y;
            
		  
		  System.out.println(" The swapping of  x is  :" + x); //print  the value of x  after swapping 
		  System.out.println(" The swapping of  y is  :" +y);  //print  the value of y after swapping
	}	  
}
