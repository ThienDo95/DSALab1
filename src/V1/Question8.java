package V1;
import java.io.*;

/*
 * Purpose: Data Structure and Algorithms Lab 1 Problem 8
 * Status: Complete and thoroughly tested
 * Last update: 01/25/17
 * Submitted:  01/26/17
 * Comment: test suite and sample run attached
 * @author: Thien Do
 * @version: 2017.01.25
 */
public class Question8 
{
	static BufferedReader stdin = new BufferedReader (new InputStreamReader ( System.in));
	
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Enter the number of pairs: ");
		String input = stdin.readLine().trim();
		Integer n = Integer.parseInt(input);
		
		if (n == 0)
		{
			System.out.println("The weighted means and simple arithmetic means are 0");
		}
		else 
		{
			int i = 0;
			Integer amount;
			double weighted = 0;
			double wAverage = 0;
			
			for (int c = 1; c <= n ; c++)
			{
				System.out.println("Enter the amount "+ c + ":");
				String am = stdin.readLine().trim(); 
				amount = Integer.parseInt(am);
				i += amount;
				
				System.out.print("Enter the weighted " + c + ":");
				String wei = stdin.readLine().trim();
				weighted = Double.parseDouble(wei);
				
				wAverage += (amount * weighted);
			}
			
			System.out.println("Weighted means of " + n + " is " +  wAverage/n);
			System.out.println("Simple means of " + n + " is " + (double)i/5 );
		}
	}

}
