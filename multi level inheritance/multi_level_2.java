//WAP to do the process of swapping , Greater between 5 no, 
//Check charactyer is vowel or not using Multilevel Inheriutance
package inheritance;

import java.util.Scanner;

public class multi_level_2 extends multi_level_1
{
	public static void vowel_check() 
	{
		
	  System.out.println(" Enter the character : ");
         Scanner sc=new Scanner(System.in);
	    c =sc.next().charAt(0);

	  
	  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U' )
	{
	 System.out.println(" It is vowel : "+c);  

	}
	else
	{
	 System.out.println(" It is constant: "+c);  
	}  
}
}
