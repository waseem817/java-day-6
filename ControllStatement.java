
import java.util.*;
class ControllStatement
{
	public static void main (String[] args) 
	{
	    Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Break statement:");
        for(int i=0;i<n;i++)
	    {
			if(i==2)
			break;
            System.out.println(i);	
		}
        System.out.println("Continue statement:");
		for(int j=0;j<n;j++)
		{
			if(j==2)
			continue;
            System.out.println(j);  
		} 
    }
}            
   
