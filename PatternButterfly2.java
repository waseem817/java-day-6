import java.util.*;
class PatternButterfly2
{
	public static void main (String[] args) 
	{
	    Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
	    {
		    for(int j=0;j<n;j++)
		    {
			   if(j==0 || i==j || i+j==n-1 || j==n-1 || i==n/2 )
			   System.out.print("*"+" ");
			   else
			   System.out.print(" "+" ");
		    }
		    System.out.println();
        }
    }
}            
   
