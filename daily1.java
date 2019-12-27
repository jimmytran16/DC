/*Good morning! Here's your coding interview problem for today.
This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.*/

import java.util.*;
import java.io.*;

class daily1{
	public static void main(String argzz[]){
		int[] MY_LIST = {10,15,3,7};
		int[] MY_LIST_2 = {9,4,5,3,7};
		int[] MY_LIST_3 = {1,15,16,5,6};
		int MY_SUM = 17;
		//true
		if(addUpToK(MY_LIST,MY_SUM))
			System.out.println("There is a pair");
		else
			System.out.println("NO PAIR ADDED UP TO GET "+MY_SUM);
		//false
		if(addUpToK(MY_LIST_2,MY_SUM))
			System.out.println("There is a pair");
		else
			System.out.println("NO PAIR ADDED UP TO GET "+MY_SUM);
		//true
		if(addUpToK(MY_LIST_3,MY_SUM))
			System.out.println("There is a pair");
		else
			System.out.println("NO PAIR ADDED UP TO GET "+MY_SUM);
	}
	/*boolean func that iterates through list using nested for loop and adding elements to see if there is pair*/
	/*if yes, return true */
	public static boolean addUpToK(int[] list, int k){
		for(int x:list){
			for(int y:list){
				if(y+x==k){
					return true;
				}
			}
		}
		return false;
	}
}
