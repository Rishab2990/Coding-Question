import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    Scanner sc = new Scanner (System.in);
		// your code goes here
		 int G = sc.nextInt();
        int S = sc.nextInt();
        int B = sc.nextInt();
        
        // Calculate additional medals needed
        int goldNeeded = Math.max(0, 5 - G);
        int silverNeeded = Math.max(0, 5 - S);
        int bronzeNeeded = Math.max(0, 5 - B);
        
        // Total additional medals needed
        int totalNeeded = goldNeeded + silverNeeded + bronzeNeeded;
        
        // Output the result
        System.out.println(totalNeeded);
        
        sc.close();

	}
}
