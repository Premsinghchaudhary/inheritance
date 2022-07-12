package Hybried;

public class greater_no extends Accept {
	public void find_grt()
	{
		System.out.println("The Process Of GRETAER BETWEEN THREE NUMBERS :");
		accept_demo();
		 g=arr[0];
		for(i=0;i<size;i++)
		{
			if(g<arr[i])
			{
				g=arr[i];
			}
		}
		System.out.println("The greater number is ="+g);
	}
}
