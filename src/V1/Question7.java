package V1;
import java.io.*;

/*
 * Purpose: Data Structure and Algorithms Lab 1 Problem 7
 * Status: Complete and thoroughly tested
 * Last update: 01/25/17
 * Submitted:  01/26/17
 * Comment: test suite and sample run attached
 * @author: Thien Do
 * @version: 2017.01.25
 */
public class Question7 
{

	static BufferedReader stdin = new BufferedReader ( new InputStreamReader (System.in));

	public static void main(String[] args) throws IOException 
	{
		String input;
		String concatenation = "";
		
		System.out.println("Enter number of people: " );
		input = stdin.readLine();
		Integer n =  Integer.parseInt(input);
		
		if( n == 1)
		{
			System.out.println("Enter name number " + n + " : ");
			String name = stdin.readLine().trim();
			System.out.println(name + " says Hello Class!!!");
		}
		else if ( n == 2)
		{	
			for ( int c = 1 ; c <= n; c++)
			{
			
				if (c == 2)
				{
					System.out.println("Enter name number " + c + " :");
					String name2 = stdin.readLine().trim();
					concatenation += (" and " + name2);
					break;
				}
				System.out.print("Enter name number " + c +":");
                String firstName = stdin.readLine().trim();
                concatenation += firstName;     
			}
			System.out.println(concatenation + " say Hello Class!!!");
		}
		else
		{
			for ( int c = 1 ; c <= n; c++)
			{
			
				if (c == n)
				{
					System.out.println("Enter name number " + c + ":");
					String nameN = stdin.readLine().trim();
					concatenation += ("and " + nameN);
					break;
				}
				System.out.print("Enter name number " + c +":");
                String firstName = stdin.readLine().trim();
                concatenation += (firstName + ", ") ;     
			}
			System.out.println(concatenation + " say Hello Class!!!");
		}
	}
}
