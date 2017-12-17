package V1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q9Driver
{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Character> al = new ArrayList<Character>();
	
	public static void main(String[] args) throws IOException 
	{
		Question9 q9 = new Question9();
		
		q9.addChar('a');
		q9.addChar('b');
		q9.addChar('c');
		q9.addChar('d');
		q9.addChar('e');
		q9.addChar('f');
	
		q9.displayNameOfProcessingMethod();
		
		/**
		al.add('d');
		al.add('a');
		al.add('d');
										
		q9.testIfPalindromeNameOfProcessingMethod(al);
		**/
		
	}
	
	

}
