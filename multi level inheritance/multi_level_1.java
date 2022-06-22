//WAP to do the process of swapping , Greater between 5 no, 
//Check charactyer is vowel or not using Multilevel Inheriutance
package inheritance;



public class multi_level_1 extends Main_class
{
	
    public static void grater_no() 
    {
    	
        System.out.print("Enter the Size : ");
        size = sc.nextInt();
        int num[] = new int[size];
        
        System.out.println("Enter the Number :" + size );
        for(i=0; i<size; i++)
        {
        	num[i] = sc.nextInt();
        }
        

        
        max = num[0];
            for(i=0; i<size; i++)
           {
        	    if(max < num[i])
              {
            	max = num[i];
              }        	
           }
    System.out.println(" The greater no is : "+max);
    } 
    

}
