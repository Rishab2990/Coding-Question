import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int laddu_Price = 10 ;
		int jalebi_Price = 20;
		
		// Total amount
		int initiallyAmount = sc.nextInt();
		
		// how many laddu 
		int sweetsLaddu = sc.nextInt();
		 int totalCostOfLaddu = sweetsLaddu*laddu_Price;
		 
		  int AmountRemain = initiallyAmount-totalCostOfLaddu ;
		  
		  int jalebiSweet = AmountRemain/jalebi_Price;
		  System.out.println(jalebiSweet);
		 
		 
	}
}
