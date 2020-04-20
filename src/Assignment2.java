

 
    	
		
		
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Assignment2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		

 
    	
		System.out.println("a");
		
	int [] a = new int[4];
		int count=0,ques=0;
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		 
		 for(int i=0;i<n;i++)
		 {
			
			 count=0;
		     for(int j=0;j<3;j++)
		     {   
		    	 
		    	
		    	 a[j] = ab.nextInt();
		    	 if(a[j] == 1)
		    		 count++;
		     }
		     
		     if(count >=2)
		    	   ques++;
		     
		 }
		System.out.println(ques);
		
		
	}
 
}
	
		
	