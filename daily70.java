/*Good morning! Here's your coding interview problem for today.
This problem was asked by Microsoft.
A number is considered perfect if its digits sum up to exactly 10.
Given a positive integer n, return the n-th perfect number.
For example, given 1, you should return 19. Given 2, you should return 28*/
import java.util.*;
import java.io.*;		

class daily70{	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a number from 1 to 9	: ");
		int x  = input.nextInt();
		System.out.println(tenFinder(x));
	}
	//loops through 0-10 and checks if 'x' + the number will sum up to 10
	//if true then return that value
	public static int tenFinder(int x)
	{
		String value="";
		for(int counter =0;counter<10;counter++)
		{
			if(counter + x ==10)
			{
				value = String.valueOf(x)+String.valueOf(counter);
			}
			else if(!(x<10))
			{
				return 0;
			}
		}
		return Integer.valueOf(value);
	}
}

