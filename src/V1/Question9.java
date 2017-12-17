package V1;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
/*
 * Purpose: Data Structure and Algorithms Lab 1 Problem 9
 * *Status: [Redo]Complete and tested thoroughly
 * Last update: 02/10/17
 * Submitted:  02/14/17
 * Comment: test suite and sample run attached
 * @author: Thien Do
 * @version: 2017.02.10
 */
public class Question9
{
	private ArrayList<Character> data;
	
	
	public Question9()
	{
		data = new ArrayList<Character>();
	}
	
	public void addChar(Character c)
	{
		data.add(c);
	}
	
	/**
	 * I've found 6 ways to print a collection normal
	 * @throws IOException
	 */
	public void displayNameOfProcessingMethod() throws IOException 
	{
	
		System.out.println("This is for each loop");
		for(Character datas: data)
		{
			System.out.println(datas.toString());
		}
		System.out.println(" ");
			
		System.out.println("This is for loop");
		for (int c = 0; c < data.size(); c++)
		{
			System.out.println(data.get(c));
		}
		System.out.println(" ");
		
		System.out.println("This is while loop");
				
		int k = 0;
		while (k < data.size())
		{
			System.out.println(data.get(k));
			k++;
		}
		System.out.println(" ");
		
		System.out.println("This is iterator");
		Iterator <Character> it = data.iterator();
		while(it.hasNext())
		{
			Character chars = it.next();
			System.out.println(chars);
		}
		System.out.println(" ");
		
		System.out.println("This is using lambda");
		data.forEach(datas ->
		{
			System.out.println(datas);
		});
		System.out.println(" ");
		
		System.out.println("This is using lambda + method reference");
		data.forEach(System.out::println);
	}

	/**
	* I've found, so far, three traditional ways to print the collection backward
	*/
	public void displayReverseNameOfProcessingMethod() throws IOException
	{
			// Print the collection from the last elements to the first
			System.out.println("This is for loop print backward");
			for(int c = data.size() - 1; c >= 0; c--)
			{
				System.out.println(data.get(c));
			}
			System.out.println(" ");
			
			// Print the collection from the last elements to the first
			// First it traverses through the collection before it prints
			System.out.println("This is ListIterator print backward");
			ListIterator <Character> it = data.listIterator(data.size());
			while(it.hasPrevious())
			{
				Character c = it.previous();
				System.out.println(c);
			}
			System.out.println(" ");
			
			// Literally flip the collection backward then print
			System.out.println("This collections reverse method");
			Collections.reverse(data);
			System.out.println(data);
	}
	
	/**
	* I have found only one way to test for palidrome
	*/
	public boolean testIfPalindromeNameOfProcessingMethod(ArrayList<Character> al)
	{
		int t = al.size();
		boolean test = true;
		for ( int i = 0; i < (t/2); ++i)
		{
			if(al.get(i) != al.get(t - i - 1))
			{
				test = false;	
			}
		}
		System.out.println(test);
		return test;
	}
}
