/*Good morning! Here's your coding interview problem for today.
This problem was asked by Uber.
Given an array of integers, return a new array such that each element 
at index i of the new array is the product of all the numbers in the 
original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output 
would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected 
output would be [2, 3, 6].*/

import java.io.*;
import java.util.*;


class check
{
	boolean checkIfEqual(int q, int w)   //checks if the first element of array is equal to the second
	{
		if(q==w)
		{return true;}
		else
		return false;
	}
}
class daily2
{
	public static void main (String args[])
	{
		int array1[]={1,2,3,4,5};	//input array
		int[] array2=new int[array1.length];  //new array, OUTPUT array
		check obj = new check();
		
		for(int x=0;x<array1.length;x++)   //iterates one by one of the element of first array
		{
			int total=1;
			for(int i=0;i<array1.length;i++)
			{
				// calls in obj of 'check' class to see if the element of first arr is = second arr
				//if yes, then skip that element and multiply the rest to total
				if(obj.checkIfEqual(x,i)) 
				{
					continue;
				}
				else 
				
				total*=array1[i];
			}
			//gives each element of second array a product of all previous elements except for one, AT A TIME
			array2[x]=total; 
		}
		System.out.print(Arrays.toString(array2));	
	}	
}